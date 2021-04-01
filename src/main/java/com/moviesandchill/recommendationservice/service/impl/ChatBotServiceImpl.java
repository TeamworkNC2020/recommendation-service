package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService {
    private MessageCategorizerService messageCategorizerService;

    @Override
    public ChatBotMessageDto answer(String text, long userId) {
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
