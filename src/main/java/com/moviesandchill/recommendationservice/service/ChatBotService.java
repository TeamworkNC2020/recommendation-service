package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.recommendation.message.ChatBotMessageDto;
import com.moviesandchill.recommendationservice.dto.recommendation.message.RecommendationChatBotMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {

    private RecommendationService recommendationService;
    private MessageCategorizerService messageCategorizerService;
    private SimpMessagingTemplate simpMessagingTemplate;

    public ChatBotMessageDto answerToUser(String text, long userId) {
        String category = messageCategorizerService.getCategory(text, userId);

        var message = switch (category) {
            case "conversation-start" -> createConversationStartMessage();
            case "conversation-complete" -> createConversationEndMessage();
            //genres
            case "recommend-anything" -> createRecommendAnythingMessage(userId);
            case "recommend-by-genre-action" -> createRecommendByGenreMessage(userId, "боевик");
            case "recommend-by-genre-adventure" -> createRecommendByGenreMessage(userId, "приключения");
            case "recommend-by-genre-anime" -> createRecommendByGenreMessage(userId, "аниме");
            case "recommend-by-genre-cartoon" -> createRecommendByGenreMessage(userId, "мультфильм");
            case "recommend-by-genre-children" -> createRecommendByGenreMessage(userId, "детский");
            case "recommend-by-genre-comedy" -> createRecommendByGenreMessage(userId, "комедия");
            case "recommend-by-genre-crime" -> createRecommendByGenreMessage(userId, "криминал");
            case "recommend-by-genre-detective" -> createRecommendByGenreMessage(userId, "детектив");
            case "recommend-by-genre-documentary" -> createRecommendByGenreMessage(userId, "документальный");
            case "recommend-by-genre-drama" -> createRecommendByGenreMessage(userId, "драма");
            case "recommend-by-genre-fiction" -> createRecommendByGenreMessage(userId, "фантастика");
            case "recommend-by-genre-historical" -> createRecommendByGenreMessage(userId, "история");
            case "recommend-by-genre-horror" -> createRecommendByGenreMessage(userId, "ужасы");
            case "recommend-by-genre-melodrama" -> createRecommendByGenreMessage(userId, "мелодрама");
            case "recommend-by-genre-short_film" -> createRecommendByGenreMessage(userId, "короткометражка");
            case "recommend-by-genre-thriller" -> createRecommendByGenreMessage(userId, "триллер");
            case "recommend-by-genre-war" -> createRecommendByGenreMessage(userId, "военный");
            case "recommend-by-genre-western" -> createRecommendByGenreMessage(userId, "вестерн");
            default -> new ChatBotMessageDto(".......what?");
        };

        simpMessagingTemplate.convertAndSend("/topic/users/" + userId + "/chat-bot/messages", message);
        return message;
    }

    private ChatBotMessageDto createConversationStartMessage() {
        return new ChatBotMessageDto("привет!");
    }

    private ChatBotMessageDto createConversationEndMessage() {
        return new ChatBotMessageDto("пока!");
    }

    private ChatBotMessageDto createRecommendAnythingMessage(long userId) {
        var films = recommendationService.recommend(userId);
        var message = new RecommendationChatBotMessageDto();
        message.setText("рекомендации: ");
        message.setFilms(films);
        return message;
    }

    private ChatBotMessageDto createRecommendByGenreMessage(long userId, String genre) {
        var films = recommendationService.recommendByGenre(userId, genre);
        var message = new RecommendationChatBotMessageDto();
        message.setText("рекомендации по жанру " + genre);
        message.setFilms(films);
        return message;
    }

    @Autowired
    public void setRecommendationService(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @Autowired
    public void setMessageCategorizerService(MessageCategorizerService messageCategorizerService) {
        this.messageCategorizerService = messageCategorizerService;
    }

    @Autowired
    public void setSimpMessagingTemplate(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }
}
