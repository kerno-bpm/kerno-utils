package com.kerno.utils.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.io.Serializable;

@Data
public class AbstractDto implements Serializable {
    private Long id;
    private boolean active;
    @JsonIgnore
    private boolean isBuilt;

    public AbstractDto() {
        isBuilt = false;
    }
}
