// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

/**
 * @returns {string}
 */
function RequestLocationPermission(): void {
    // BEGIN USER CODE
    // Documentation https://facebook.github.io/react-native/docs/geolocation#requestauthorization

    navigator.geolocation.requestAuthorization();

    // END USER CODE
}
