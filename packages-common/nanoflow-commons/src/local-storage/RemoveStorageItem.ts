// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

import ReactNative from "react-native";

/**
 * Remove a content identified by a unique key. This could be set via any of the Set Storage Item JavaScript actions.
 * @returns {boolean}
 */
// eslint-disable-next-line no-unused-vars,@typescript-eslint/no-unused-vars
function RemoveStorageItem(key?: string): Promise<boolean> {
    // BEGIN USER CODE

    if (!key) {
        throw new TypeError("Input parameter 'Key' is required");
    }

    return removeItem(key).then(() => true);

    function removeItem(key: string): Promise<void> {
        if (navigator && navigator.product === "ReactNative") {
            const AsyncStorage: typeof ReactNative.AsyncStorage = require("@react-native-community/async-storage")
                .default;
            return AsyncStorage.removeItem(key);
        }

        if (window) {
            window.localStorage.removeItem(key);
            return Promise.resolve();
        }

        throw new Error("No storage API available");
    }
    // END USER CODE
}
