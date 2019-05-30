package com.kerno.utils.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class KernoApiError {
    @JsonProperty
    private long timestamp;
    @JsonProperty
    private int status;
    @JsonProperty
    private String error;
    @JsonProperty
    private String message;
    @JsonProperty
    private String path;
}
