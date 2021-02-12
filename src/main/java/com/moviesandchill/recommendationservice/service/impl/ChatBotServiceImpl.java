package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
import com.moviesandchill.recommendationservice.service.ChatBotService;
import com.moviesandchill.recommendationservice.service.GenreService;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import org.springframework.stereotype.Service;

@Service
public class ChatBotServiceImpl implements ChatBotService {
    private final MessageCategorizerService messageCategorizerService;
    private final RecommendationService recommendationService;
    private final GenreService genreService;

    public ChatBotServiceImpl(MessageCategorizerService messageCategorizerService, RecommendationService recommendationService, GenreService genreService) {
        this.messageCategorizerService = messageCategorizerService;
        this.recommendationService = recommendationService;
        this.genreService = genreService;
    }

    @Override
    public ChatBotMessage answer(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        //FIXME
        switch (category) {
            case "greeting":
                return new ChatBotMessage("привет!");
            case "conversation-complete":
                return new ChatBotMessage("до встречи!");
        }

        return new ChatBotMessage("oops!");
    }
}
