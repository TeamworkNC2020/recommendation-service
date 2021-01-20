package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;

public interface ChatBotService {
    ChatBotMessage answer(String text, long userId);
}
