package com.kerno.utils.cqrs;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class KernoPageable {
    private int pageNumber;
    private int pageSize;
    private String sort;

    public KernoPageable() {
    }

    public KernoPageable(int pageNumber, int pageSize) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
    }

    public KernoPageable(int pageNumber, int pageSize, String sort) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sort = sort;
    }
}
