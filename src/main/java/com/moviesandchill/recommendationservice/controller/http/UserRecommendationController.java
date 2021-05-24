package com.moviesandchill.recommendationservice.controller.http;

import com.moviesandchill.recommendationservice.dto.film.FullFilmDto;
import com.moviesandchill.recommendationservice.service.RecommendationService;
import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.*;

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
    private List<FullFilmDto> getRecommendations(
            @PathVariable long userId,
            @RequestParam(required = false) String genre
    ) {
        if (genre != null) {
            return recommendationService.recommendByGenre(userId, genre);
        }
        return recommendationService.recommend(userId);
    }
}
