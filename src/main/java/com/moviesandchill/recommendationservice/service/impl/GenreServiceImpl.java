package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.Genre;
import com.moviesandchill.recommendationservice.service.GenreService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenreServiceImpl implements GenreService {
    List<Genre> genres = new ArrayList<>();

    {
        genres.add(new Genre(1, "action"));
        genres.add(new Genre(2, "comedy"));
        genres.add(new Genre(3, "romance"));
    }

    @Override
    public List<Genre> getAllGenres() {
        return genres;
    }

    @Override
    public List<Genre> getGenresByName(String name) {
        return new ArrayList<>(); //FIXME
    }

    @Override
    public Optional<Genre> getGenreByName(String name) {
        return Optional.empty();
    }
}
