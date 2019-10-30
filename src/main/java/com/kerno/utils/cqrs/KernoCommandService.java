package com.kerno.utils.cqrs;

public interface KernoCommandService<T, ID> {
    <S extends T> S addEntity(T data);

    <S extends T> S editEntity(T data, ID id);

    void deleteEntity(ID id);
}
