package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.mapper.UserFilmRatingMapper;
import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import com.moviesandchill.recommendationservice.service.ReviewService;
import com.moviesandchill.recommendationservice.service.UserFilmRatingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFilmRatingServiceImpl implements UserFilmRatingService {

    private final ReviewService reviewService;
    private final UserFilmRatingMapper userFilmRatingMapper;

    public UserFilmRatingServiceImpl(ReviewService reviewService, UserFilmRatingMapper userFilmRatingMapper) {
        this.reviewService = reviewService;
        this.userFilmRatingMapper = userFilmRatingMapper;
    }

    @Override
    public List<UserFilmRating> getAllFilmsRatings() {
        var reviewDtos = reviewService.getAllReviews();
        return userFilmRatingMapper.toPojo(reviewDtos);
    }
}
