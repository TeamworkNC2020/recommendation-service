package com.moviesandchill.recommendationservice.util;

import opennlp.tools.doccat.*;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.*;
import opennlp.tools.util.model.ModelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public final class NlpUtils {

    private static final Logger logger = LoggerFactory.getLogger(NlpUtils.class);
    private static final String TRAINING_SET_PATH = "train.txt";

    private NlpUtils() {
    }

    public static DoccatModel trainCategorizerModel() {
        try {
            logger.info("start load training set with path " + TRAINING_SET_PATH);
            InputStreamFactory inputStreamFactory = new MarkableFileInputStreamFactory(new File(TRAINING_SET_PATH));
            ObjectStream<String> lineStream = new PlainTextByLineStream(inputStreamFactory, StandardCharsets.UTF_8);
            ObjectStream<DocumentSample> sampleStream = new DocumentSampleStream(lineStream);

            DoccatFactory factory = new DoccatFactory(new FeatureGenerator[]{new BagOfWordsFeatureGenerator()});

            TrainingParameters params = ModelUtil.createDefaultTrainingParameters();
            params.put(TrainingParameters.CUTOFF_PARAM, 0);
            params.put("PrintMessages", false); // disable messages

            logger.info("start training model");
            return DocumentCategorizerME.train("ru", sampleStream, params, factory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, Double> getCategories(DoccatModel model, String[] finalTokens) {
        DocumentCategorizerME myCategorizer = new DocumentCategorizerME(model);
        return myCategorizer.scoreMap(finalTokens);
    }

    public static String[] tokenizeSentence(String sentence) {
        SimpleTokenizer myCategorizer = SimpleTokenizer.INSTANCE;

        String[] tokens = myCategorizer.tokenize(sentence);
        logger.info("split sentence to tokens : " + String.join(" | ", tokens));
        return tokens;
    }

}
