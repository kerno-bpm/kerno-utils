package com.kerno.utils.common;

import java.util.List;

public interface KernoServiceCrud<T, ID> {
    <S extends T> S add(T data);

    <S extends T> S edit(T data, ID id);

    List<T> findAll();
}
