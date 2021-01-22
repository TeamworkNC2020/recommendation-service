package com.moviesandchill.recommendationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Film {
    private long filmId;
    private String name;
    private String description;
    private List<String> genres = new ArrayList<>();
}
