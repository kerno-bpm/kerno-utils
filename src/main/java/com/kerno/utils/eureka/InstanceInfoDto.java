package com.kerno.utils.eureka;

import lombok.Data;

@Data
public class InstanceInfoDto {
    private int port;
    private String ipAddr;
}
