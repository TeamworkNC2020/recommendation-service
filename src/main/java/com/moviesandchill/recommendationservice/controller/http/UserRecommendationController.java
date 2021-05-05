package com.moviesandchill.recommendationservice.controller.http;

import com.moviesandchill.recommendationservice.service.RecommendationService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/users/{userId}/recommendations")
@Log4j
public class UserRecommendationController {

    private final RecommendationService recommendationService;

    public UserRecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    @GetMapping
    private List<Long> getRecommendations(@PathVariable long userId) {
        return recommendationService.recommend(userId);
    }
}
