package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {
    private final MessageCategorizerService messageCategorizerService;
    private final SimpMessagingTemplate simpMessagingTemplate;

    public ChatBotService(MessageCategorizerService messageCategorizerService, SimpMessagingTemplate simpMessagingTemplate) {
        this.messageCategorizerService = messageCategorizerService;
        this.simpMessagingTemplate = simpMessagingTemplate;
    }


    public ChatBotMessageDto answerToUser(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        //FIXME
        var message = switch (category) {
            case "greeting" -> new ChatBotMessageDto("привет!");
            case "conversation-complete" -> new ChatBotMessageDto("до встречи!");
            default -> new ChatBotMessageDto("oops!");
        };

        simpMessagingTemplate.convertAndSend("/topic/users/" + userId + "/chat-bot/messages", message);
        return message;
    }
}
