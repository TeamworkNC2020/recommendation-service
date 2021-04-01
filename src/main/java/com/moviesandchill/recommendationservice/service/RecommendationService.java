package com.moviesandchill.recommendationservice.service;

import java.util.List;

public interface RecommendationService {
    List<Long> recommend(long userId);

    List<Long> recommendByGenre(long userId, long genreId);

    List<Long> recommendByActor(long userId, long actorId);
}
