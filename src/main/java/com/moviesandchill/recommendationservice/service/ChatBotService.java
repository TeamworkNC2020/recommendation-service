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

        var message = switch (category) {
            case "conversation-start" -> new ChatBotMessageDto("conversation-start");
            case "conversation-complete" -> new ChatBotMessageDto("conversation-complete");
            //genres
            case "recommend-anything" -> new ChatBotMessageDto("recommend-anything");
            case "recommend-by-genre-action" -> new ChatBotMessageDto("recommend-by-genre-action");
            case "recommend-by-genre-adventure" -> new ChatBotMessageDto("recommend-by-genre-adventure");
            case "recommend-by-genre-anime" -> new ChatBotMessageDto("recommend-by-genre-anime");
            case "recommend-by-genre-cartoon" -> new ChatBotMessageDto("recommend-by-genre-cartoon");
            case "recommend-by-genre-children" -> new ChatBotMessageDto("recommend-by-genre-children");
            case "recommend-by-genre-comedy" -> new ChatBotMessageDto("recommend-by-genre-comedy");
            case "recommend-by-genre-crime" -> new ChatBotMessageDto("recommend-by-genre-crime");
            case "recommend-by-genre-detective" -> new ChatBotMessageDto("recommend-by-genre-detective");
            case "recommend-by-genre-documentary" -> new ChatBotMessageDto("recommend-by-genre-documentary");
            case "recommend-by-genre-drama" -> new ChatBotMessageDto("recommend-by-genre-drama");
            case "recommend-by-genre-fiction" -> new ChatBotMessageDto("recommend-by-genre-fiction");
            case "recommend-by-genre-historical" -> new ChatBotMessageDto("recommend-by-genre-historical");
            case "recommend-by-genre-horror" -> new ChatBotMessageDto("recommend-by-genre-horror");
            case "recommend-by-genre-melodrama" -> new ChatBotMessageDto("recommend-by-genre-melodrama");
            case "recommend-by-genre-short_film" -> new ChatBotMessageDto("recommend-by-genre-short_film");
            case "recommend-by-genre-thriller" -> new ChatBotMessageDto("recommend-by-genre-thriller");
            case "recommend-by-genre-war" -> new ChatBotMessageDto("recommend-by-genre-war");
            case "recommend-by-genre-western" -> new ChatBotMessageDto("recommend-by-genre-western");
            default -> new ChatBotMessageDto(".......what?");
        };

        simpMessagingTemplate.convertAndSend("/topic/users/" + userId + "/chat-bot/messages", message);
        return message;
    }
}
