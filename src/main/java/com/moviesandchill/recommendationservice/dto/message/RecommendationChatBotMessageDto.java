package com.moviesandchill.recommendationservice.dto.message;

import com.moviesandchill.recommendationservice.dto.film.FilmDto;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Getter
@Setter
public class RecommendationChatBotMessageDto extends ChatBotMessageDto {
    private List<FilmDto> films;

    public RecommendationChatBotMessageDto(String text, List<FilmDto> films) {
        super(text);
        this.films = films;
    }
}
