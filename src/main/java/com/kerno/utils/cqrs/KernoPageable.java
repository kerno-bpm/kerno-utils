package com.kerno.utils.cqrs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KernoPageable {
    private int pageNumber;
    private int pageSize;
    private String sort;
}
