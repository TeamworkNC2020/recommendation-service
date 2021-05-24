package com.moviesandchill.recommendationservice.dto.film;


import com.moviesandchill.recommendationservice.dto.film.agelimit.AgeLimitDto;
import com.moviesandchill.recommendationservice.dto.film.country.CountryDto;
import com.moviesandchill.recommendationservice.dto.film.genre.GenreDto;
import com.moviesandchill.recommendationservice.dto.film.review.FullReviewDto;
import com.moviesandchill.recommendationservice.dto.film.screenshot.ScreenshotDto;
import com.moviesandchill.recommendationservice.dto.film.staff.StaffDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullFilmDto {

    private Long idFilm;

    private String filmTitle;

    private LocalDateTime duration;

    private LocalDate releaseDate;

    private String filmPoster;

    private String filmTrailer;

    private String filmVideo;

    private BigInteger filmBudget;

    private String description;

    private float rating;

    private AgeLimitDto ageLimit;

    private CountryDto country;

    private List<GenreDto> genres = new ArrayList<>();

    private List<StaffDto> actors = new ArrayList<>();

    private List<StaffDto> producers = new ArrayList<>();

    private List<FullReviewDto> reviews = new ArrayList<>();

    private List<ScreenshotDto> screenshots = new ArrayList<>();
}
