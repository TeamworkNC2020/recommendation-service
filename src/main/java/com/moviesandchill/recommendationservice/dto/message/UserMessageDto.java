package com.moviesandchill.recommendationservice.dto.message;

import lombok.Data;

@Data
public class UserMessageDto {
    private String text;
    private long userId;
}
