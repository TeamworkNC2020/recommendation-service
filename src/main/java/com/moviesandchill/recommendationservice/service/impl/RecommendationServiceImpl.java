package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.service.RecommendationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    @Override
    public List<Long> recommend(long userId) {
        return null;
    }

    @Override
    public List<Long> recommendByGenre(long userId, long genreId) {
        return null;
    }

    @Override
    public List<Long> recommendByActor(long userId, long actorId) {
        return null;
    }
}
