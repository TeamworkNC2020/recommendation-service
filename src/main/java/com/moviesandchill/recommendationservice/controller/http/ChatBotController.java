package com.moviesandchill.recommendationservice.controller.http;

import com.moviesandchill.recommendationservice.dto.recommendation.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.dto.recommendation.message.UserMessageDto;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/chat-bot")
@Log4j
public class ChatBotController {
    private final ChatBotService chatBotService;

    public ChatBotController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @PostMapping
    public ChatBotMessageDto answer(@RequestBody UserMessageDto userMessageDto) {
        var text = userMessageDto.getText();
        var userId = userMessageDto.getUserId();
        return chatBotService.answerToUser(text, userId);
    }
}
