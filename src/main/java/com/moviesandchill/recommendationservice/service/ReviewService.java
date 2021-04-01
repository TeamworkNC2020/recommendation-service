package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAllReviews();
}
