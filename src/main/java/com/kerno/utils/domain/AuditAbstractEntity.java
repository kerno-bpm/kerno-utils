package com.kerno.utils.domain;

import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
@AttributeOverrides({
        @AttributeOverride(name = "revtstmp", column = @Column(name = "timestamp")),
        @AttributeOverride(name = "rev", column = @Column(name = "id"))})
public abstract class AuditAbstractEntity extends DefaultRevisionEntity {
    @Column(nullable = false)
    private String userId;

}