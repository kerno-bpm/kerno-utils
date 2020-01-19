package com.kerno.utils.cqrs;

public interface KernoFetchByIdService<T, ID> {
    <S extends T> S findByID(ID id);
}
