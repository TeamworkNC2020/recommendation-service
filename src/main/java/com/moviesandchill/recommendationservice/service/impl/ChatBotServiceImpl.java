package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService {
    private final MessageCategorizerService messageCategorizerService;

    private final RecommendationService recommendationService;

    public ChatBotServiceImpl(MessageCategorizerService messageCategorizerService, RecommendationService recommendationService) {
        this.messageCategorizerService = messageCategorizerService;
        this.recommendationService = recommendationService;
    }

    @Override
    public ChatBotMessage answer(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        switch (category) {
            case "greeting":
                return new ChatBotMessage("hi", "sample", null);
            case "conversation-complete":
                return new ChatBotMessage("goodbye!", "sample", null);
            case "comedy":
                return new ChatBotMessage("recommended comedies:", "films-list", recommendationService.recommend(0, "comedy"));
            case "action":
                return new ChatBotMessage("recommended actions:", "films-list", recommendationService.recommend(0, "action"));
            case "romance":
                return new ChatBotMessage("recommended romances:", "films-list", recommendationService.recommend(0, "romance"));
        }

        return new ChatBotMessage("oops! impossible", "sample", null);
    }
}
