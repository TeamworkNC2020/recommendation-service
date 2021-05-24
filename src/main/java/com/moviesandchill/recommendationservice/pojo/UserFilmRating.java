package com.moviesandchill.recommendationservice.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserFilmRating {
    private long idUser;
    private long idFilm;
    private float rating;
}
