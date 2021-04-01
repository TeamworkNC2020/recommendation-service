package com.moviesandchill.recommendationservice.repository;

import com.moviesandchill.recommendationservice.entity.MessageCategorizerSample;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageCategorizerSampleRepository extends CrudRepository<MessageCategorizerSample, Long> {
    @SuppressWarnings("NullableProblems")
    @Override
    List<MessageCategorizerSample> findAll();
}
