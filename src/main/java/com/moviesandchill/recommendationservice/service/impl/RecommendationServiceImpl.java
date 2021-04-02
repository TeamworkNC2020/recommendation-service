package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import com.moviesandchill.recommendationservice.service.UserFilmRatingService;
import com.moviesandchill.recommendationservice.util.recommendation.RecommendationUtils;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationServiceImpl implements RecommendationService {

    private final UserFilmRatingService userFilmRatingService;

    public RecommendationServiceImpl(UserFilmRatingService userFilmRatingService) {
        this.userFilmRatingService = userFilmRatingService;
    }

    @Override
    public List<Long> recommend(long userId) {
        List<UserFilmRating> ratings = userFilmRatingService.getAllFilmsRatings();
        var recommendations = RecommendationUtils.recommend(ratings, userId);
        return recommendations.stream()
                .map(RecommendedItem::getItemID)
                .collect(Collectors.toList());
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
