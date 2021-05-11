package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.review.ReviewDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class ReviewService {

    private final String filmServiceUrl;

    private final RestTemplate restTemplate;

    public ReviewService(@Value("${endpoint.film-service.url}") String filmServiceUrl, RestTemplate restTemplate) {
        this.filmServiceUrl = filmServiceUrl;
        this.restTemplate = restTemplate;
    }

    public List<ReviewDto> getAllReviews() {
        String url = filmServiceUrl + "/reviews";
        var dtoArray = restTemplate.getForObject(url, ReviewDto[].class);
        var dtoList = Arrays.asList(Objects.requireNonNull(dtoArray));
        log.info("loaded " + dtoList.size() + " reviews");
        return dtoList;
    }
}
