package com.kerno.utils.eureka;


public interface BaseEurekaService {

    String getEndpointByName(InstanceInfoDto instanceInfo, String name);

    String getEndpointByExternalId(InstanceInfoDto instanceInfo, String externalId);
}
