package com.kerno.utils.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.sql.Timestamp;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MessageKafkaDto<T> {
    private Timestamp created;
    private String user;
    private T data;

    public MessageKafkaDto() {
        created = new Timestamp(System.currentTimeMillis());
    }
}
