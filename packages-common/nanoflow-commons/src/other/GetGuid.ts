// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

/**
 * Get the Mendix Object GUID.
 * @param {MxObject} entityObject - This field is required.
 * @returns {string}
 */
// eslint-disable-next-line no-unused-vars,@typescript-eslint/no-unused-vars
function GetGuid(entityObject: mendix.lib.MxObject): string {
    // BEGIN USER CODE
    if (!entityObject) {
        throw new TypeError("Input parameter 'Entity object' is required.");
    }

    return entityObject.getGuid();
    // END USER CODE
}
