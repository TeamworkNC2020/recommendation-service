package com.moviesandchill.recommendationservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "message_categorizer_samples")
@Data
@NoArgsConstructor
public class MessageCategorizerSample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageCategorizerTrainingSampleId; // wtf?

    private String category;

    private String text;
}
