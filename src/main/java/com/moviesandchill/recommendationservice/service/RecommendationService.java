package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.entity.Film;

import java.util.List;

public interface RecommendationService {
    List<Film> recommend(long userId);

    List<Film> recommendByGenre(long userId, long genreId);

    List<Film> recommendByActor(long userId, long actorId);
}
