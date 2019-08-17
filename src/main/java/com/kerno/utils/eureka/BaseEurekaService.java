package com.kerno.utils.eureka;


public interface BaseEurekaService {

    String getEndpoint(InstanceInfoDto instanceInfo, String url);
}
