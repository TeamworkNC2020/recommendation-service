package com.moviesandchill.recommendationservice.dto.film.review;

import com.moviesandchill.recommendationservice.dto.user.user.UserDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullReviewDto {

    private Long idReview;

    private Float ratingFilm;

    private String review;

    private LocalDate reviewDate;

    private UserDto user;
}
