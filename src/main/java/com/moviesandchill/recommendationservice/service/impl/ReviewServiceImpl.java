package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.dto.ReviewDto;
import com.moviesandchill.recommendationservice.mapper.CommonMapper;
import com.moviesandchill.recommendationservice.service.ReviewService;
import com.moviesandchill.recommendationservice.util.RestTemplateUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {
    private final CommonMapper commonMapper;
    @Value("${endpoint.film-service.url}")
    private String baseUrl;

    public ReviewServiceImpl(CommonMapper commonMapper) {
        this.commonMapper = commonMapper;
    }

    @Override
    public List<ReviewDto> getAllReviews() {
        String url = baseUrl + "/reviews";
        var dtos = RestTemplateUtils.get(url, ReviewDto[].class).orElseThrow();
        return commonMapper.toList(dtos);
    }
}
