package com.kerno.utils.domain;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(updatable = false)
    private Timestamp created;
    @Version
    @Column(updatable = true)
    private Timestamp updated;
    @Column(name = "is_active", nullable = false)
    private Boolean active;

    @PrePersist
    public void createAt() {
        created = new Timestamp(System.currentTimeMillis());
    }
}
