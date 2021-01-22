package com.moviesandchill.recommendationservice.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class ChatBotMessageWithFilms extends ChatBotMessage {
    private List<Film> films = new ArrayList<>();

    public ChatBotMessageWithFilms(String text, List<Film> recommendedFilms) {
        super(text);
        this.films = recommendedFilms;
    }
}
