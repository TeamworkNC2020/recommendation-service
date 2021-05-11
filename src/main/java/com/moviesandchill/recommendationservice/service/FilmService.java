package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.film.FilmDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class FilmService {

    private final RestTemplate restTemplate;

    @Value("${endpoint.film-service.url}")
    private String filmServiceUrl;

    public FilmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FilmDto getFilmById(long filmId) {
        String url = filmServiceUrl + "/films/" + filmId;
        return restTemplate.getForObject(url, FilmDto.class);
    }
}
