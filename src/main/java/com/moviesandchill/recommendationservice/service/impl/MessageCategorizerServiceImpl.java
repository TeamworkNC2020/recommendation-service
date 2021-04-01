package com.moviesandchill.recommendationservice.service.impl;

import com.moviesandchill.recommendationservice.repository.MessageCategorizerSampleRepository;
import com.moviesandchill.recommendationservice.service.MessageCategorizerService;
import com.moviesandchill.recommendationservice.util.NlpUtils;
import opennlp.tools.doccat.DoccatModel;
import opennlp.tools.doccat.DocumentSample;
import opennlp.tools.doccat.DocumentSampleStream;
import opennlp.tools.util.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageCategorizerServiceImpl implements MessageCategorizerService {

    private final MessageCategorizerSampleRepository trainingSampleRepository;

    private DoccatModel model;

    public MessageCategorizerServiceImpl(MessageCategorizerSampleRepository trainingSampleRepository) {
        this.trainingSampleRepository = trainingSampleRepository;
    }

    @PostConstruct
    private void init() {
        ObjectStream<DocumentSample> trainingSamples = loadDocumentSampleStreamFromDatabase();
        model = NlpUtils.trainCategorizerModel(trainingSamples);
    }

    @Override
    public String getCategory(String text, long userId) {
        String[] tokens = NlpUtils.tokenizeSentence(text);
        return NlpUtils.getBestCategory(model, tokens);
    }

    private ObjectStream<DocumentSample> loadDocumentSampleStreamFromDatabase() {
        List<DocumentSample> documentSamples = trainingSampleRepository.findAll().stream()
                .map(m -> new DocumentSample(m.getCategory(), NlpUtils.tokenizeSentence(m.getText())))
                .collect(Collectors.toList());

        return new CollectionObjectStream<>(documentSamples);
    }

    private ObjectStream<DocumentSample> loadDocumentSampleStreamFromFile(String path) {
        try {
            InputStreamFactory inputStreamFactory = new MarkableFileInputStreamFactory(new File(path));
            ObjectStream<String> lineStream = new PlainTextByLineStream(inputStreamFactory, StandardCharsets.UTF_8);
            return new DocumentSampleStream(lineStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
