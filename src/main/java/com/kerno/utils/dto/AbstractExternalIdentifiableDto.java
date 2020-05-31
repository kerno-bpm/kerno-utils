package com.kerno.utils.dto;

import lombok.Data;

@Data
public class AbstractExternalIdentifiableDto extends AbstractEntityDto {
    private String externalId;
}
