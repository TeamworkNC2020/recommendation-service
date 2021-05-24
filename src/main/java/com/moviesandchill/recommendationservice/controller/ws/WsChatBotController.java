package com.moviesandchill.recommendationservice.controller.ws;

import com.moviesandchill.recommendationservice.dto.recommendation.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.dto.recommendation.message.UserMessageDto;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class WsChatBotController {

    private final ChatBotService chatBotService;

    public WsChatBotController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @MessageMapping("/chat-bot/send")
    public ChatBotMessageDto answer(@Payload UserMessageDto userMessageDto) {
        log.info(String.valueOf(userMessageDto));
        var text = userMessageDto.getText();
        var userId = userMessageDto.getUserId();
        return chatBotService.answerToUser(text, userId);
    }
}
