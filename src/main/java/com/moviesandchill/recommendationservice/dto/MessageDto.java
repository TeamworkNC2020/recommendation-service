package com.moviesandchill.recommendationservice.dto;

import lombok.Data;

@Data
public class MessageDto {
    private String text;
    private long userId;
}
