package com.moviesandchill.recommendationservice.dto.recommendation.message;

import com.moviesandchill.recommendationservice.dto.film.FullFilmDto;
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
    private List<FullFilmDto> films;

    public RecommendationChatBotMessageDto(String text, List<FullFilmDto> films) {
        super(text);
        this.films = films;
    }
}
