package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService {
    private MessageCategorizerService messageCategorizerService;

    @Override
    public ChatBotMessage answer(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        //FIXME
        return switch (category) {
            case "greeting" -> new ChatBotMessage("привет!");
            case "conversation-complete" -> new ChatBotMessage("до встречи!");
            default -> new ChatBotMessage("oops!");
        };
    }

    @Autowired
    public void setMessageCategorizerService(MessageCategorizerService messageCategorizerService) {
        this.messageCategorizerService = messageCategorizerService;
    }
}
