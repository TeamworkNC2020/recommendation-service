package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.film.FullFilmDto;
import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import com.moviesandchill.recommendationservice.util.recommendation.RecommendationUtils;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    private final UserFilmRatingService userFilmRatingService;
    private final FilmService filmService;
    private final FilmGenreService filmGenreService;

    public RecommendationService(UserFilmRatingService userFilmRatingService, FilmService filmService, FilmGenreService filmGenreService) {
        this.userFilmRatingService = userFilmRatingService;
        this.filmService = filmService;
        this.filmGenreService = filmGenreService;
    }

    public List<FullFilmDto> recommend(long userId) {
        List<UserFilmRating> ratings = userFilmRatingService.getAllFilmsRatings();
        var recommendations = RecommendationUtils.recommend(ratings, userId);
        return recommendations.stream()
                .map(RecommendedItem::getItemID)
                .map(filmService::getFullFilmById)
                .collect(Collectors.toList());
    }

    public List<FullFilmDto> recommendByGenre(long userId, String genre) {
        return recommend(userId).stream()
                .filter(f -> filmGenreService.getGenresAsString(f.getIdFilm()).contains(genre))
                .collect(Collectors.toList());
    }
}
