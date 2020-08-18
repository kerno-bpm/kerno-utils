package com.kerno.utils.cqrs;

import com.kerno.utils.criteria.KernoPageable;

import java.util.List;

@Deprecated
public interface KernoFetchAllPageableService<T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
