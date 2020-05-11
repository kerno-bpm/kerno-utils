package com.kerno.utils.dto;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class AbstractDto implements Serializable {
    private Long id;
    private boolean active;
    private Timestamp created;
    private Timestamp updated;

    public AbstractDto() {
        active = true;
    }
}
