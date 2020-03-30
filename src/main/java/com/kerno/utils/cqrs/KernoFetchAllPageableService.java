package com.kerno.utils.cqrs;

import com.kerno.utils.criteria.KernoPageable;

import java.util.List;

public interface KernoFetchAllPageableService<T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
