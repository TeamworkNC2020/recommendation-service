package com.moviesandchill.recommendationservice.controller.api;

import com.moviesandchill.recommendationservice.dto.MessageDto;
import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
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
    private ChatBotMessage chatBot(@RequestBody MessageDto messageDto) {
        String text = messageDto.getText();
        long userId = messageDto.getUserId();
        return chatBotService.answer(text, userId);
    }
}
