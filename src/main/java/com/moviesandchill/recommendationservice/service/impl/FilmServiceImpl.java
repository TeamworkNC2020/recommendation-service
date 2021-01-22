package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.entity.Film;
import com.moviesandchill.recommendationservice.service.FilmService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmServiceImpl implements FilmService {

    private static final List<Film> films = new ArrayList<>();

    static {
        films.add(new Film(1, "один дома", "", List.of("comedy")));
        films.add(new Film(2, "Мстители: Война бесконечности", "", List.of("action")));
        films.add(new Film(3, "В джазе только девушки", "", List.of("romance")));
    }

    @Override
    public List<Film> getAllFilms() {
        return films;
    }

    @Override
    public List<Film> getFilmsByGenre(String genre) {
        return films.stream()
                .filter(film -> film.getGenres().contains(genre))
                .collect(Collectors.toList());
    }
}
