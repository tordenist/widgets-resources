// This file was generated by Mendix Studio Pro.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the code between BEGIN USER CODE and END USER CODE
// Other code you write will be lost the next time you deploy the project.

import ReactNative from "react-native";
import { StorageValue } from "./StorageValue";

/*
 * Retrieve a local stored list of Mendix objects identified by a unique key. When objects are the client state it will be returned, if not they will be re-created. Note: when re-creating the local Mendix object the Mendix Object ID will never be the same.
 * @returns {MxObject}
 */
// eslint-disable-next-line no-unused-vars,@typescript-eslint/no-unused-vars
function GetStorageItemObjectList(key?: string, entity?: string): Promise<mendix.lib.MxObject[]> {
    // BEGIN USER CODE

    if (!key) {
        throw new TypeError("Input parameter 'Key' is required");
    }

    if (!entity) {
        throw new TypeError("Input parameter 'Entity' is required");
    }

    return getItem(key).then(result => {
        if (result === null) {
            throw new Error(`Storage item '${key}' does not exist`);
        }
        const values: StorageValue[] = JSON.parse(result);

        return Promise.all(values.map(value => getOrCreateMxObject(entity, value))).then(newObjects => {
            const newValues = newObjects.map(newObject => serializeMxObject(newObject));
            return setItem(key, JSON.stringify(newValues)).then(() => newObjects);
        });
    });

    function getItem(key: string): Promise<string | null> {
        if (navigator && navigator.product === "ReactNative") {
            const AsyncStorage: typeof ReactNative.AsyncStorage = require("@react-native-community/async-storage")
                .default;
            return AsyncStorage.getItem(key);
        }

        if (window) {
            const value = window.localStorage.getItem(key);
            return Promise.resolve(value);
        }

        throw new Error("No storage API available");
    }

    function setItem(key: string, value: string): Promise<void> {
        if (navigator && navigator.product === "ReactNative") {
            const AsyncStorage: typeof ReactNative.AsyncStorage = require("@react-native-community/async-storage")
                .default;
            return AsyncStorage.setItem(key, value);
        }

        if (window) {
            window.localStorage.setItem(key, value);
            return Promise.resolve();
        }

        throw new Error("No storage API available");
    }

    function getOrCreateMxObject(entity: string, value: StorageValue): Promise<mendix.lib.MxObject> {
        return getMxObject(value.guid).then(existingObject => {
            if (existingObject) {
                return existingObject;
            } else {
                return createMxObject(entity, value);
            }
        });
    }

    function getMxObject(guid: string): Promise<mendix.lib.MxObject | undefined> {
        return new Promise((resolve, reject) => {
            mx.data.get({
                guid,
                callback: mxObject => resolve(mxObject),
                error: (error: Error) => reject(error)
            });
        });
    }

    function createMxObject(entity: string, value: StorageValue): Promise<mendix.lib.MxObject> {
        return new Promise((resolve, reject) => {
            mx.data.create({
                entity,
                callback: mxObject => {
                    Object.keys(value)
                        .filter(attribute => attribute !== "guid")
                        .forEach(attributeName => {
                            const attributeValue = value[attributeName];
                            mxObject.set(attributeName, attributeValue);
                        });
                    resolve(mxObject);
                },
                // eslint-disable-next-line prefer-promise-reject-errors
                error: () => reject(`Could not create '${entity}' object`)
            });
        });
    }

    function serializeMxObject(object: mendix.lib.MxObject): StorageValue {
        return object.getAttributes().reduce<StorageValue>(
            (accumulator, attributeName) => {
                accumulator[attributeName] = object.get(attributeName);
                return accumulator;
            },
            { guid: object.getGuid() }
        );
    }
    // END USER CODE
}
