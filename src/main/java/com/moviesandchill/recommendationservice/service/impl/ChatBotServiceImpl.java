package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService {
    private final MessageCategorizerService messageCategorizerService;

    public ChatBotServiceImpl(MessageCategorizerService messageCategorizerService) {
        this.messageCategorizerService = messageCategorizerService;
    }

    @Override
    public ChatBotMessage answer(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);
        return new ChatBotMessage(category);
    }
}
