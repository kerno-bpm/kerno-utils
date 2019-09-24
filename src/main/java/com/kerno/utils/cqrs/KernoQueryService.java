package com.kerno.utils.cqrs;

public interface KernoQueryService<T, ID> {
    <S extends T> S findByID(ID id);
}
