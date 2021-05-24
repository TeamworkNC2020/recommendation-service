package com.moviesandchill.recommendationservice.dto.film.gender;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GenderDto {

    private Long id_gender;

    private String gender_title;
}
