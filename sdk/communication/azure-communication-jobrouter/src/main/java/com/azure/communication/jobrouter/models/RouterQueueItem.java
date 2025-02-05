// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.jobrouter.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.ETag;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Paged instance of RouterQueue. */
@Fluent
public final class RouterQueueItem {
    /*
     * A queue that can contain jobs to be routed.
     */
    @JsonProperty(value = "queue")
    private RouterQueue queue;

    /*
     * (Optional) The Concurrency Token.
     */
    @JsonProperty(value = "etag")
    private ETag etag;

    /**
     * Get the queue property: A queue that can contain jobs to be routed.
     *
     * @return the queue value.
     */
    public RouterQueue getQueue() {
        return this.queue;
    }

    /**
     * Set the queue property: A queue that can contain jobs to be routed.
     *
     * @param queue the queue value to set.
     * @return the RouterQueueItem object itself.
     */
    public RouterQueueItem setQueue(RouterQueue queue) {
        this.queue = queue;
        return this;
    }

    /**
     * Get the etag property: (Optional) The Concurrency Token.
     *
     * @return the etag value.
     */
    public ETag getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: (Optional) The Concurrency Token.
     *
     * @param etag the etag value to set.
     * @return the RouterQueueItem object itself.
     */
    public RouterQueueItem setEtag(ETag etag) {
        this.etag = etag;
        return this;
    }
}
