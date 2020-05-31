package com.kerno.utils.domain;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
