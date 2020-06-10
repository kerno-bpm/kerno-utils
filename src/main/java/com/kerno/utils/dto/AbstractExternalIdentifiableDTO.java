package com.kerno.utils.dto;

import lombok.Data;

@Data
public class AbstractExternalIdentifiableDTO extends AbstractEntityDTO {
    private String externalId;
}
