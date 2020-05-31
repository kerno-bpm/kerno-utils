package com.kerno.utils.domain;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractExternalId extends AbstractId {
    protected String externalId;
}
