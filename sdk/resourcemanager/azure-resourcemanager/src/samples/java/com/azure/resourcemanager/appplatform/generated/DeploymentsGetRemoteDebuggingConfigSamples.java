// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.core.util.Context;

/** Samples for Deployments GetRemoteDebuggingConfig. */
public final class DeploymentsGetRemoteDebuggingConfigSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2022-12-01/examples/Deployments_GetRemoteDebuggingConfig.json
     */
    /**
     * Sample code: Deployments_GetRemoteDebuggingConfig.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deploymentsGetRemoteDebuggingConfig(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getDeployments()
            .getRemoteDebuggingConfigWithResponse(
                "myResourceGroup", "myservice", "myapp", "mydeployment", Context.NONE);
    }
}
