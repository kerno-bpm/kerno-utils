package com.kerno.utils.cqrs;

public interface KernoCommandService<T, ID> {
    T addEntity(T data);

    T editEntity(T data, ID id);
}
