package com.moviesandchill.recommendationservice.dto.review;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class ReviewDto {
    @JsonAlias("idReview")
    private long reviewId;

    @JsonAlias("idUser")
    private long userId;

    @JsonAlias("idFilm")
    private long filmId;

    @JsonAlias("ratingFilm")
    private float rating;
}
