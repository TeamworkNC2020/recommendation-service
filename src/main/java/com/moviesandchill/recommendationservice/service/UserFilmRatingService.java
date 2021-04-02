package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.pojo.UserFilmRating;

import java.util.List;

public interface UserFilmRatingService {
    List<UserFilmRating> getAllFilmsRatings();
}
