package com.moviesandchill.recommendationservice.dto.film.country;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CountryDto {

    private Long id_country;

    private String country_name;
}
