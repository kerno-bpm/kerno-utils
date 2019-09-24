package com.kerno.utils.cqrs;

import java.util.List;

public interface KernoFindAllQueryService<T> {
    List<T> findAll();
}
