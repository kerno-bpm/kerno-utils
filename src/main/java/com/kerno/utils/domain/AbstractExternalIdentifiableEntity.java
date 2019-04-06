package com.kerno.utils.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

//@Data
@MappedSuperclass
@ToString(callSuper = true)
public abstract class AbstractExternalIdentifiableEntity extends AbstractEntity {
    @Column(length = 36)
    protected String externalId;

    @PrePersist
    public void initializeExternalId() {
        if (externalId == null) {
            externalId = UUID.randomUUID().toString();
        }
    }
}
