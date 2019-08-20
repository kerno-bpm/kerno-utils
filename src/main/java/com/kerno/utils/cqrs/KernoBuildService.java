package com.kerno.utils.cqrs;

public interface KernoBuildService<T, E> {
    <S extends T> S buildEntity(E entityToBuild);
}
