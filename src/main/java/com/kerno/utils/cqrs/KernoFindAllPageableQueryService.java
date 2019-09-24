package com.kerno.utils.cqrs;

import java.util.List;

public interface KernoFindAllPageableQueryService<T> {
    List<T> findAllPageable(KernoPageable kernoPageable);
}
