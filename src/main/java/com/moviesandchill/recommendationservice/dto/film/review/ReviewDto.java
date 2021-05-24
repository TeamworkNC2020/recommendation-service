package com.moviesandchill.recommendationservice.dto.film.review;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewDto {

    private Long idReview;

    private Float ratingFilm;

    private String review;

    private LocalDate reviewDate;

    private Long idUser;

    private Long idFilm;
}
