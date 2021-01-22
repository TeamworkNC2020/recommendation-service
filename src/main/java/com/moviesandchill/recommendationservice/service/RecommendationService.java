package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.entity.Film;

import java.util.List;

public interface RecommendationService {
    List<Film> recommend(long userId, String genre);
}
