package com.kerno.utils.cqrs;

import java.util.List;

public interface KernoFetchAllPageableService<T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
