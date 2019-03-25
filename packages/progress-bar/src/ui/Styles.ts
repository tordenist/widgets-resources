import { Style } from "@native-components/util-widgets";
import { Platform, ViewStyle } from "react-native";

export interface ProgressBarStyle extends Style {
    container: ViewStyle;
    bar: ViewStyle;
    fill: {
        backgroundColor: string;
    };
}
export const defaultProgressBarStyle: ProgressBarStyle = {
    container: {},
    bar: {
        width: "100%",
        height: 6,
        ...Platform.select({
            ios: {
                borderWidth: 1,
                borderRadius: 4,
                borderColor: "rgb(0,122,255)"
            },
            android: {
                borderRadius: 0,
                borderWidth: 0,
                backgroundColor: "rgba(98,0,238, 0.2)"
            }
        })
    },
    fill: {
        backgroundColor: Platform.select({ ios: "rgb(0,122,255)", android: "rgb(98,0,238)" })
    }
};