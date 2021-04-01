package com.moviesandchill.recommendationservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFilmRating {
    private long userId;
    private long filmId;
    private int rating;
}
