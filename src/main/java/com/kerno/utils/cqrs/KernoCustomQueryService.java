package com.kerno.utils.cqrs;

import java.util.List;
import java.util.Map;

public interface KernoCustomQueryService<T> {
    List<T> findAllBy(Map<String, Object> filters);
}
