package com.kerno.utils.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.sql.Timestamp;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageKafkaDTO<T> {
    private Timestamp created;
    private String user;
    private T data;

    public MessageKafkaDTO() {
        created = new Timestamp(System.currentTimeMillis());
    }
}
