package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;

public interface ChatBotService {
    ChatBotMessageDto answer(String text, long userId);
}
