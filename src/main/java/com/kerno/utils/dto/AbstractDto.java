package com.kerno.utils.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
public class AbstractDto implements Serializable {
    private Long id;
    private boolean active;
    @JsonIgnore
    private boolean isBuilt = false;
}
