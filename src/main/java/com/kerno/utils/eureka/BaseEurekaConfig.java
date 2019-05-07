package com.kerno.utils.eureka;

import lombok.Data;

@Data
public class BaseEurekaConfig {
    private String serviceId;
    private String port;
}
