package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.entity.Film;

import java.util.List;

public interface FilmService {
    List<Film> getAllFilms();

    List<Film> getFilmsByGenre(String genre);
}
