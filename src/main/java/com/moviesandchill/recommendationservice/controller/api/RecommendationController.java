package com.moviesandchill.recommendationservice.controller.api;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.dto.message.UserMessageDto;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = "api/v1/recommendations/",
        produces = "application/json"
)
public class RecommendationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ChatBotService chatBotService;

    public RecommendationController(ChatBotService chatBotService) {
        this.chatBotService = chatBotService;
    }

    @PostMapping("chat_bot")
    private ChatBotMessageDto chatBot(@RequestBody UserMessageDto userMessageDto) {
        String text = userMessageDto.getText();
        long userId = userMessageDto.getUserId();
        return chatBotService.answer(text, userId);
    }
}
