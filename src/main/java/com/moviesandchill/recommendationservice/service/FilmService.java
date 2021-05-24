package com.moviesandchill.recommendationservice.service;

import com.moviesandchill.recommendationservice.dto.film.FullFilmDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class FilmService {

    private final RestTemplate restTemplate;

    @Value("${endpoint.portal-backend-service.url}")
    private String portalBackendServiceUrl;

    public FilmService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // FIXME
    public FullFilmDto getFullFilmById(long filmId) {
        String url = portalBackendServiceUrl + "/api/v1/films/full/" + filmId;
        var films = restTemplate.getForObject(url, FullFilmDto.class);
        log.info(String.valueOf(films));
        return films;
    }
}
