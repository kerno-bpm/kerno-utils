package com.kerno.utils.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AbstractDto implements Serializable {
    private Long id;
    private boolean active;

    public AbstractDto() {
        active = true;
    }
}
