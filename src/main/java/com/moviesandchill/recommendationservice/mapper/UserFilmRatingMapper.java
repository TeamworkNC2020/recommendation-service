package com.moviesandchill.recommendationservice.mapper;

import com.moviesandchill.recommendationservice.dto.film.review.ReviewDto;
import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS
)
public interface UserFilmRatingMapper {
    UserFilmRating toPojo(ReviewDto dto);

    List<UserFilmRating> toPojo(List<ReviewDto> dto);
}
