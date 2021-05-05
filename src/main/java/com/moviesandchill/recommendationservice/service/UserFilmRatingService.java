package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.mapper.UserFilmRatingMapper;
import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserFilmRatingService {

    private final ReviewService reviewService;
    private final UserFilmRatingMapper userFilmRatingMapper;

    public UserFilmRatingService(ReviewService reviewService, UserFilmRatingMapper userFilmRatingMapper) {
        this.reviewService = reviewService;
        this.userFilmRatingMapper = userFilmRatingMapper;
    }

    public List<UserFilmRating> getAllFilmsRatings() {
        var reviewDtos = reviewService.getAllReviews();
        var userFilmRatings = userFilmRatingMapper.toPojo(reviewDtos);
        log.info(String.valueOf(userFilmRatings));
        return userFilmRatings;
    }
}
