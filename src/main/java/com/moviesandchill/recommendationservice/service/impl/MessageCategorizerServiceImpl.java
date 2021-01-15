package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import com.moviesandchill.recommendationservice.util.NlpUtils;
import opennlp.tools.doccat.DoccatModel;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Map;

@Service
public class MessageCategorizerServiceImpl implements MessageCategorizerService {

    private DoccatModel model;

    @PostConstruct
    private void init() {
        model = NlpUtils.trainCategorizerModel();
    }

    @Override
    public Map<String, Double> getCategories(String text, long userId) {
        String[] tokens = NlpUtils.tokenizeSentence(text);
        return NlpUtils.getCategories(model, tokens);
    }
}
