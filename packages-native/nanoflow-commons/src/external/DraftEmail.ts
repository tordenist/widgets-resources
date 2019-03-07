// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

import ReactNative from "react-native";

/**
 * @param {string} recipient - The recipient, or recipients, separated by comma's.
 * @param {string} cc - The CC recipient(s).
 * @param {string} bcc - The BCC recipient(s).
 * @param {string} subject
 * @param {string} body
 * @returns {boolean}
 */
function DraftEmail(recipient?: string, cc?: string, bcc?: string, subject?: string, body?: string): Promise<boolean> {
    // BEGIN USER CODE
    // Documentation https://facebook.github.io/react-native/docs/linking

    const Linking: typeof ReactNative.Linking = require("react-native").Linking;

    let url = "mailto:";
    if (recipient) {
        url += `${encodeURI(recipient)}?`;
    }
    if (cc) {
        url += `cc=${encodeURIComponent(cc)}&`;
    }
    if (bcc) {
        url += `bcc=${encodeURIComponent(bcc)}&`;
    }
    if (subject) {
        url += `subject=${encodeURIComponent(subject)}&`;
    }
    if (body) {
        url += `body=${encodeURIComponent(body)}&`;
    }

    // Remove the last '?' or '&'
    url = url.slice(0, -1);

    return Linking.canOpenURL(url).then(supported => {
        if (supported === false) {
            return false;
        }
        return Linking.openURL(url).then(() => true);
    });

    // END USER CODE
}
