package com.kerno.utils.cqrs;

@Deprecated
public interface KernoCommandService<T, ID> {
    T addEntity(T data);

    T editEntity(T data, ID id);
}
