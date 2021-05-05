package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {
    private MessageCategorizerService messageCategorizerService;

    public ChatBotMessageDto answerToUser(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        //FIXME
        return switch (category) {
            case "greeting" -> new ChatBotMessageDto("привет!");
            case "conversation-complete" -> new ChatBotMessageDto("до встречи!");
            default -> new ChatBotMessageDto("oops!");
        };
    }

    @Autowired
    public void setMessageCategorizerService(MessageCategorizerService messageCategorizerService) {
        this.messageCategorizerService = messageCategorizerService;
    }
}
