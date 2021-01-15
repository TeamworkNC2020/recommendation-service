package com.moviesandchill.recommendationservice.repository;

import com.moviesandchill.recommendationservice.entity.MessageCategorizerTrainingSample;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageCategorizerTrainingSampleRepository extends CrudRepository<MessageCategorizerTrainingSample, Long> {
    @SuppressWarnings("NullableProblems")
    @Override
    List<MessageCategorizerTrainingSample> findAll();
}
