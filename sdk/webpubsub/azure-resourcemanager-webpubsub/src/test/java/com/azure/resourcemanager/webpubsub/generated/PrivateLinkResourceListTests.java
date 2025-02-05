// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateLinkResourceInner;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkResourceList;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceProperties;
import com.azure.resourcemanager.webpubsub.models.ShareablePrivateLinkResourceType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PrivateLinkResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateLinkResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"groupId\":\"twjchrdg\",\"requiredMembers\":[\"xum\",\"ctondz\",\"luudfdlwggytsb\"],\"requiredZoneNames\":[\"vvt\",\"seinqfiuf\",\"qknp\",\"rgnepttwqmsniffc\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"r\",\"properties\":{}},{\"name\":\"pij\",\"properties\":{}},{\"name\":\"xfrdd\",\"properties\":{}},{\"name\":\"atiz\",\"properties\":{}}]},\"id\":\"onasxifto\",\"name\":\"qyzhf\",\"type\":\"wesgogczh\"},{\"properties\":{\"groupId\":\"xkr\",\"requiredMembers\":[\"yhmossxkkg\",\"h\",\"rghxjb\",\"hqxvcxgfrpdsofbs\"],\"requiredZoneNames\":[\"svbuswdvzyy\",\"ycnunvjsrtk\",\"awnopqgikyzirtxd\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"ejnt\",\"properties\":{}}]},\"id\":\"ewgioilqukrydxt\",\"name\":\"mieoxorgguf\",\"type\":\"yaomtb\"},{\"properties\":{\"groupId\":\"avgrvkffovjz\",\"requiredMembers\":[\"bibgjmfxumv\",\"cluyovwxnbkf\"],\"requiredZoneNames\":[\"xscyhwzdgirujbz\",\"omvzzbtd\",\"qvpn\",\"yujviylwdshfssn\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"efr\",\"properties\":{}}]},\"id\":\"sgaojfmwncot\",\"name\":\"rfh\",\"type\":\"rctym\"},{\"properties\":{\"groupId\":\"ftpipiwyczu\",\"requiredMembers\":[\"cpqjlihhyu\"],\"requiredZoneNames\":[\"kasdvlm\",\"wdgzxulucv\",\"amrsreuzv\",\"urisjnhnytxifqj\"],\"shareablePrivateLinkResourceTypes\":[{\"name\":\"rhublwpcesutrg\",\"properties\":{}},{\"name\":\"auutpwoqhihe\",\"properties\":{}}]},\"id\":\"g\",\"name\":\"zpnfqntcypsxj\",\"type\":\"foimwkslircizjxv\"}],\"nextLink\":\"fceacvlhvygd\"}")
                .toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals("twjchrdg", model.value().get(0).groupId());
        Assertions.assertEquals("xum", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("vvt", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("r", model.value().get(0).shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("fceacvlhvygd", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateLinkResourceList model =
            new PrivateLinkResourceList()
                .withValue(
                    Arrays
                        .asList(
                            new PrivateLinkResourceInner()
                                .withGroupId("twjchrdg")
                                .withRequiredMembers(Arrays.asList("xum", "ctondz", "luudfdlwggytsb"))
                                .withRequiredZoneNames(Arrays.asList("vvt", "seinqfiuf", "qknp", "rgnepttwqmsniffc"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("r")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("pij")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("xfrdd")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("atiz")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()))),
                            new PrivateLinkResourceInner()
                                .withGroupId("xkr")
                                .withRequiredMembers(Arrays.asList("yhmossxkkg", "h", "rghxjb", "hqxvcxgfrpdsofbs"))
                                .withRequiredZoneNames(Arrays.asList("svbuswdvzyy", "ycnunvjsrtk", "awnopqgikyzirtxd"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("ejnt")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()))),
                            new PrivateLinkResourceInner()
                                .withGroupId("avgrvkffovjz")
                                .withRequiredMembers(Arrays.asList("bibgjmfxumv", "cluyovwxnbkf"))
                                .withRequiredZoneNames(
                                    Arrays.asList("xscyhwzdgirujbz", "omvzzbtd", "qvpn", "yujviylwdshfssn"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("efr")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()))),
                            new PrivateLinkResourceInner()
                                .withGroupId("ftpipiwyczu")
                                .withRequiredMembers(Arrays.asList("cpqjlihhyu"))
                                .withRequiredZoneNames(
                                    Arrays.asList("kasdvlm", "wdgzxulucv", "amrsreuzv", "urisjnhnytxifqj"))
                                .withShareablePrivateLinkResourceTypes(
                                    Arrays
                                        .asList(
                                            new ShareablePrivateLinkResourceType()
                                                .withName("rhublwpcesutrg")
                                                .withProperties(new ShareablePrivateLinkResourceProperties()),
                                            new ShareablePrivateLinkResourceType()
                                                .withName("auutpwoqhihe")
                                                .withProperties(new ShareablePrivateLinkResourceProperties())))))
                .withNextLink("fceacvlhvygd");
        model = BinaryData.fromObject(model).toObject(PrivateLinkResourceList.class);
        Assertions.assertEquals("twjchrdg", model.value().get(0).groupId());
        Assertions.assertEquals("xum", model.value().get(0).requiredMembers().get(0));
        Assertions.assertEquals("vvt", model.value().get(0).requiredZoneNames().get(0));
        Assertions.assertEquals("r", model.value().get(0).shareablePrivateLinkResourceTypes().get(0).name());
        Assertions.assertEquals("fceacvlhvygd", model.nextLink());
    }
}
