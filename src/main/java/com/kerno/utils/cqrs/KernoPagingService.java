package com.kerno.utils.cqrs;

import com.kerno.utils.criteria.KernoPageable;

import java.util.List;

public interface KernoPagingService<E, ID, T> extends KernoCrudService<E, ID, T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
