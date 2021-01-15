package com.moviesandchill.recommendationservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "message_categorizer_training_samples")
@Data
@NoArgsConstructor
public class MessageCategorizerTrainingSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long MessageCategorizerTrainingSampleId; // wtf?

    private String category;

    private String text;
}
