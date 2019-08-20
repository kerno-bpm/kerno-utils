package com.kerno.utils.cqrs;

import java.util.List;

public interface KernoQueryService<T, ID> {
    <S extends T> S findByID(ID id);

    List<T> findAll();

    <S extends T> S buildEntity(Object ...params);
}
