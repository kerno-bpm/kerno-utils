package com.kerno.utils.common;

public interface KernoServiceSimple<T, ID> {
    <S extends T> S findByID(ID id);
}
