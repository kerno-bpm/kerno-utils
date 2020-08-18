package com.kerno.utils.cqrs;

import com.kerno.utils.criteria.KernoPageable;

import java.util.List;

/**
 * Allows fetch a object list with paging.
 * @param <T>
 */
public interface KernoPagingService<T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
