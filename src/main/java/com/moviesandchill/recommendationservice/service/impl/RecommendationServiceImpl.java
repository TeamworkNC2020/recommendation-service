package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.Film;
import com.moviesandchill.recommendationservice.service.FilmService;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    private final FilmService filmService;

    public RecommendationServiceImpl(FilmService filmService) {
        this.filmService = filmService;
    }

    @Override
    public List<Film> recommend(long userId) {
        return null;
    }

    @Override
    public List<Film> recommendByGenre(long userId, long genreId) {
        return null;
    }

    @Override
    public List<Film> recommendByActor(long userId, long actorId) {
        return null;
    }
}
