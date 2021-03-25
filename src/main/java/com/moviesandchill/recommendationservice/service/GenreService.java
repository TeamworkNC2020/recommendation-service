package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.entity.Genre;

import java.util.List;
import java.util.Optional;

public interface GenreService {
    List<Genre> getAllGenres();

    List<Genre> getGenresByName(String name);

    Optional<Genre> getGenreByName(String name);
}
