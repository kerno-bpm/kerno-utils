package com.kerno.utils.domain;

import lombok.Data;
import org.hibernate.envers.DefaultRevisionEntity;

import javax.persistence.*;

@Data
@MappedSuperclass
@AttributeOverrides({
        @AttributeOverride(name = "revtstmp", column = @Column(name = "timestamp")),
        @AttributeOverride(name = "rev", column = @Column(name = "id"))})
public abstract class AuditAbstractEntity extends DefaultRevisionEntity {
    @Override
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return super.getId();
    }

    @Column(nullable = false)
    private String userId;

}