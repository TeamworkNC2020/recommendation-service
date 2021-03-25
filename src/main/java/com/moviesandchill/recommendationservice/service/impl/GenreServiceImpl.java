package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.Genre;
import com.moviesandchill.recommendationservice.service.GenreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GenreServiceImpl implements GenreService {
    private static final List<Genre> GENRES = new ArrayList<>();

    {
        GENRES.add(new Genre(1, "action"));
        GENRES.add(new Genre(2, "comedy"));
        GENRES.add(new Genre(3, "romance"));
    }

    @Override
    public List<Genre> getAllGenres() {
        return GENRES;
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
