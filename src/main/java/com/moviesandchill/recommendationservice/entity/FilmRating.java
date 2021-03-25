package com.moviesandchill.recommendationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmRating {
    private long userId;
    private long filmId;
    private double rating;
}