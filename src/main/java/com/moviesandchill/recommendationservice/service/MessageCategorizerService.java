package com.moviesandchill.recommendationservice.service;

import java.util.Map;

public interface MessageCategorizerService {
    Map<String, Double> getCategories(String text, long userId);
}
