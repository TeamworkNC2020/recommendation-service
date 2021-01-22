package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.ChatBotMessage;
import com.moviesandchill.recommendationservice.entity.ChatBotMessageWithFilms;
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

        //FIXME
        switch (category) {
            case "greeting":
                return new ChatBotMessage("привет!");
            case "conversation-complete":
                return new ChatBotMessage("до встречи!");
            case "comedy":
                return new ChatBotMessageWithFilms("советую посмотреть следующие комедии:", recommendationService.recommend(0, "comedy"));
            case "action":
                return new ChatBotMessageWithFilms("советую посмотреть следующие боевики:", recommendationService.recommend(0, "action"));
            case "romance":
                return new ChatBotMessageWithFilms("советую посмотреть следующие романтические фильмы:", recommendationService.recommend(0, "romance"));
        }

        return new ChatBotMessage("oops!");
    }
}
