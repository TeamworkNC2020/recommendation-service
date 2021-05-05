package com.moviesandchill.recommendationservice.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ReviewDto {
    @JsonAlias("idReview")
    private long reviewId;

    @JsonAlias("idUser")
    private long userId;

    @JsonAlias("ratingFilm")
    private float rating;

    private String review;

    @JsonAlias("reviewDate")
    private LocalDate date;
}
