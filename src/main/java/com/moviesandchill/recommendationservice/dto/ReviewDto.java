package com.moviesandchill.recommendationservice.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReviewDto {
    @JsonAlias("id_review")
    private long reviewId;

    @JsonAlias("id_user")
    private long userId;

    @JsonAlias("rating_film")
    private long filmRating;

    private String review;

    @JsonAlias("review_date")
    private LocalDate date;
}
