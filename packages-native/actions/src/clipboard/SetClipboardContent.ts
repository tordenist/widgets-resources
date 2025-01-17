// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

import ReactNative from "react-native";

/**
 * @param {string} content - This field is required.
 * @returns {boolean}
 */
// eslint-disable-next-line no-unused-vars,@typescript-eslint/no-unused-vars
function SetClipboardContent(content?: string): boolean {
    // BEGIN USER CODE
    // Documentation https://facebook.github.io/react-native/docs/clipboard#setstring

    const Clipboard: typeof ReactNative.Clipboard = require("react-native").Clipboard;

    if (!content) {
        throw new TypeError("Input parameter 'Content' is required");
    }

    Clipboard.setString(content);
    return true;

    // END USER CODE
}
