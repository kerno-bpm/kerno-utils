package com.kerno.utils.cqrs;

import java.util.List;
@Deprecated
public interface KernoFindAllQueryService<T> {
    List<T> findAll();
}
