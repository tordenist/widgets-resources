import { Component, ReactNode, createElement } from "react";
import { BadgeButton, BadgeButtonProps } from "./components/BadgeButton";
import { Alert } from "./components/Alert";
import BadgeButtonContainer, { BadgeButtonContainerProps } from "./components/BadgeButtonContainer";

declare function require(name: string): string;

type VisibilityMap = {
    [P in keyof BadgeButtonContainerProps]: boolean;
};

// tslint:disable-next-line class-name
export class preview extends Component<BadgeButtonContainerProps, {}> {
    render(): ReactNode {
        const message = BadgeButtonContainer.validateProps(this.props);
        return createElement(
            "div",
            { ref: this.parentInline },
            createElement(Alert, { bootstrapStyle: "danger", className: "widget-badge-button-alert", message }),
            createElement(BadgeButton, this.transformProps(this.props))
        );
    }

    private parentInline(node?: HTMLElement | null): void {
        // Temporary fix, the web modeler add a containing div, to render inline we need to change it.
        if (node && node.parentElement) {
            node.parentElement.style.display = "inline-block";
        }
    }

    private transformProps(props: BadgeButtonContainerProps): BadgeButtonProps {
        const valueAttributeArray = props.valueAttribute ? props.valueAttribute.split(".")[2] : "";
        return {
            bootstrapStyle: props.bootstrapStyle,
            className: props.class,
            label: props.label,
            style: BadgeButtonContainer.parseStyle(props.style),
            value: valueAttributeArray ? "[" + valueAttributeArray + "]" : props.badgeButtonValue
        };
    }
}

export function getPreviewCss(): string {
    return require("./ui/BadgeButton.css");
}

export function getVisibleProperties(props: BadgeButtonContainerProps, visibilityMap: VisibilityMap): VisibilityMap {
    visibilityMap.microflow = props.onClickEvent === "callMicroflow";
    visibilityMap.nanoflow = props.onClickEvent === "callNanoflow";
    visibilityMap.page = props.onClickEvent === "showPage";
    visibilityMap.openPageAs = props.onClickEvent === "showPage";

    return visibilityMap;
}
