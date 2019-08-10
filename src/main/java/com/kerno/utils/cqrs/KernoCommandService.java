package com.kerno.utils.cqrs;

public interface KernoCommandService<T, ID> {
    <S extends T> S addEntity(T data);

    <S extends T> S editEntity(T data, ID id);

    <S extends T> S deleteEntity(T data, ID id);
}
