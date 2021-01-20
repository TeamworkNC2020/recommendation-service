package com.moviesandchill.recommendationservice.service;

public interface MessageCategorizerService {
    String getCategory(String text, long userId);
}
