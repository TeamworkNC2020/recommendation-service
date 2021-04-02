package com.moviesandchill.recommendationservice.controller.api;

import com.moviesandchill.recommendationservice.dto.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.dto.message.UserMessageDto;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import lombok.extern.log4j.Log4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        path = "api/v1/recommendations/",
        produces = "application/json"
)
@Log4j
public class RecommendationController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ChatBotService chatBotService;
    private final RecommendationService recommendationService;

    public RecommendationController(ChatBotService chatBotService, RecommendationService recommendationService) {
        this.chatBotService = chatBotService;
        this.recommendationService = recommendationService;
    }

    @PostMapping("chat_bot")
    private ChatBotMessageDto chatBot(@RequestBody UserMessageDto userMessageDto) {
        String text = userMessageDto.getText();
        long userId = userMessageDto.getUserId();
        return chatBotService.answer(text, userId);
    }

    @GetMapping("/films")
    private List<Long> recommendFilms(@RequestParam long userId) {
        log.info(userId);
        return recommendationService.recommend(userId);
    }
}
