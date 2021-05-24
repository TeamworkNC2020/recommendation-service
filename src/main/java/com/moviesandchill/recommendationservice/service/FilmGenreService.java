package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.film.genre.GenreDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class FilmGenreService {
    private final RestTemplate restTemplate;

    @Value("${endpoint.film-service.url}")
    private String filmServiceUrl;

    public FilmGenreService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<String> getGenresAsString(long filmId) {
        String url = filmServiceUrl + "/films/" + filmId + "/genres";
        var genresDtos = restTemplate.getForObject(url, GenreDto[].class);
        assert genresDtos != null;
        return Arrays.stream(genresDtos)
                .map(GenreDto::getGenre_title)
                .collect(Collectors.toList());
    }
}
