package com.kerno.utils.domain;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class AbstractExternalId extends AbstractId {
    protected String externalId;
}
