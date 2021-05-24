package com.moviesandchill.recommendationservice.dto.film.screenshot;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScreenshotDto {

    private Long id_screenshot;

    private String screenshot;
}
