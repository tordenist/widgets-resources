import { Component, createElement, ReactNode } from "react";

import { Alert } from "./Alert";
import { ImageViewer } from "./ImageViewer";
import { UrlHelper } from "../UrlHelper";

interface WrapperProps {
    class: string;
    mxObject?: mendix.lib.MxObject;
    style: string;
    readOnly: boolean;
    mxform: mxui.lib.form._FormBase;
}

interface ImageViewerContainerProps extends WrapperProps {
    source: DataSource;
    dynamicUrlAttribute: string;
    urlStatic: string;
    imageStatic: string;
    width: number;
    widthUnit: Units;
    height: number;
    heightUnit: Units;
    responsive: boolean;
    onClickOption: onClickOptions;
    onClickMicroflow: string;
    onClickForm: string;
    onClickNanoflow: Nanoflow;
    openPageAs: PageLocation;
}

interface ImageViewerContainerState {
    alertMessage?: string;
    imageUrl: string;
}

interface Nanoflow {
    nanoflow: object[];
    paramsSpec: { Progress: string };
}

type DataSource = "systemImage" | "urlAttribute" | "staticUrl" | "staticImage";
type Units = "auto" | "pixels" | "percentage";
type onClickOptions = "doNothing" | "callMicroflow" | "showPage" | "openFullScreen" | "callNanoflow";
type PageLocation = "content" | "popup" | "modal";

class ImageViewerContainer extends Component<ImageViewerContainerProps, ImageViewerContainerState> {
    private subscriptionHandles: number[];
    private attributeCallback: (mxObject: mendix.lib.MxObject) => () => void;

    constructor(props: ImageViewerContainerProps) {
        super(props);

        const alertMessage = ImageViewerContainer.validateProps(props);
        this.state = {
            alertMessage,
            imageUrl: ""
        };
        this.subscriptionHandles = [];
        this.attributeCallback = mxObject => () => this.setImageUrl(mxObject);
        this.executeAction = this.executeAction.bind(this);
        this.setImageUrl = this.setImageUrl.bind(this);
    }

    render(): ReactNode {
        const { height, heightUnit, width, widthUnit, onClickOption, responsive } = this.props;
        const { imageUrl } = this.state;
        if (this.state.alertMessage) {
            return createElement(Alert, { message: this.state.alertMessage });
        }

        return createElement(ImageViewer, {
            className: this.props.class,
            height,
            heightUnit,
            imageUrl,
            onClick: this.executeAction,
            onClickOption,
            responsive,
            style: ImageViewerContainer.parseStyle(this.props.style),
            width,
            widthUnit
        });
    }

    componentWillReceiveProps(newProps: ImageViewerContainerProps): void {
        this.resetSubscriptions(newProps.mxObject);
        this.setState({
            alertMessage: ImageViewerContainer.validateProps(newProps)
        });
        this.setImageUrl(newProps.mxObject);
    }

    componentWillUnmount(): void {
        this.subscriptionHandles.forEach(window.mx.data.unsubscribe);
    }

    private resetSubscriptions(mxObject?: mendix.lib.MxObject): void {
        this.subscriptionHandles.forEach(window.mx.data.unsubscribe);
        this.subscriptionHandles = [];

        if (mxObject) {
            this.subscriptionHandles.push(
                window.mx.data.subscribe({
                    attr: this.props.dynamicUrlAttribute,
                    callback: this.attributeCallback(mxObject),
                    guid: mxObject.getGuid()
                })
            );
            this.subscriptionHandles.push(
                window.mx.data.subscribe({
                    callback: this.attributeCallback(mxObject),
                    guid: mxObject.getGuid()
                })
            );
        }
    }

    private setImageUrl(mxObject?: mendix.lib.MxObject): void {
        if (mxObject && this.props.source === "urlAttribute") {
            mxObject.fetch(this.props.dynamicUrlAttribute, (imageUrl: string) => {
                this.setState({ imageUrl });
            });
        } else if (mxObject && this.props.source === "systemImage") {
            const url = mx.data.getDocumentUrl(mxObject.getGuid(), mxObject.get("changedDate") as number);
            mx.data.getImageUrl(
                url,
                objectUrl => {
                    this.setState({ imageUrl: objectUrl });
                },
                error =>
                    this.setState({
                        alertMessage: `Error in imageviewer while retrieving image url: ${error.message}`
                    })
            );
        } else if (!mxObject && (this.props.source === "systemImage" || this.props.source === "urlAttribute")) {
            this.setState({ imageUrl: "" });
        } else if (this.props.source === "staticUrl") {
            this.setState({ imageUrl: this.props.urlStatic });
        } else if (this.props.source === "staticImage") {
            this.setState({ imageUrl: UrlHelper.getStaticResourceUrl(this.props.imageStatic) });
        }
    }

    private executeAction(): void {
        const { onClickMicroflow, onClickNanoflow, onClickOption, onClickForm, mxform, openPageAs } = this.props;
        const context = this.getContext();
        if (onClickOption === "callMicroflow" && onClickMicroflow) {
            window.mx.ui.action(onClickMicroflow, {
                context,
                error: error =>
                    window.mx.ui.error(
                        `An error occurred while executing action ${onClickMicroflow} : ${error.message}`
                    ),
                origin: mxform
            });
        } else if (onClickOption === "callNanoflow" && onClickNanoflow.nanoflow) {
            window.mx.data.callNanoflow({
                context,
                error: error =>
                    window.mx.ui.error(`An error occurred while executing the on click nanoflow: ${error.message}`),
                nanoflow: onClickNanoflow,
                origin: mxform
            });
        } else if (onClickOption === "showPage" && onClickForm) {
            window.mx.ui.openForm(onClickForm, {
                context,
                error: error =>
                    window.mx.ui.error(`An error occurred while opening form ${onClickForm} : ${error.message}`),
                location: openPageAs
            });
        }
    }

    private getContext(): mendix.lib.MxContext {
        const context = new window.mendix.lib.MxContext();
        if (this.props.mxObject) {
            context.setContext(this.props.mxObject.getEntity(), this.props.mxObject.getGuid());
        }

        return context;
    }

    static parseStyle(style = ""): { [key: string]: string } {
        try {
            return style.split(";").reduce<{ [key: string]: string }>((styleObject, line) => {
                const pair = line.split(":");
                if (pair.length === 2) {
                    const name = pair[0].trim().replace(/(-.)/g, match => match[1].toUpperCase());
                    styleObject[name] = pair[1].trim();
                }
                return styleObject;
            }, {});
        } catch (error) {
            // eslint-disable-next-line no-console
            console.log("Failed to parse style", style, error);
        }

        return {};
    }

    static validateProps(props: ImageViewerContainerProps): string {
        let message = "";
        if (props.source === "systemImage" && props.mxObject && !props.mxObject.isA("System.Image")) {
            message = "for data source option 'System image' the context object should inherit system.image";
        }
        if (props.source === "urlAttribute" && !props.dynamicUrlAttribute) {
            message = "for data source option 'Dynamic URL' the Dynamic image URL attribute should be configured";
        }
        if (props.source === "staticUrl" && !props.urlStatic) {
            message = "for data source option 'Static URL' a static image url should be configured";
        }
        if (props.source === "staticImage" && !props.imageStatic) {
            message = "for data source option 'Static Image' a static image should be configured";
        }
        if (props.onClickOption === "callMicroflow" && !props.onClickMicroflow) {
            message = "on click microflow is required";
        }
        if (props.onClickOption === "callNanoflow" && !props.onClickNanoflow.nanoflow) {
            message = "on click nanoflow is required";
        }
        if (props.onClickOption === "showPage" && !props.onClickForm) {
            message = "on click page is required";
        }

        return message && `Error in imageviewer configuration: ${message}`;
    }
}

export { ImageViewerContainer as default, ImageViewerContainerProps, Units, onClickOptions };
