package com.kerno.utils.cqrs;

import java.util.List;

public interface KernoPagingService<E, ID, T> extends KernoCrudService<E, ID, T> {
    List<T> findAll();
}
