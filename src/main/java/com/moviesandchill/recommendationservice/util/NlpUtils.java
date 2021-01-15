package com.moviesandchill.recommendationservice.util;

import opennlp.tools.doccat.*;
import opennlp.tools.stemmer.snowball.SnowballStemmer;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.TrainingParameters;
import opennlp.tools.util.model.ModelUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class NlpUtils {

    private static final Logger logger = LoggerFactory.getLogger(NlpUtils.class);

    private NlpUtils() {
    }

    public static DoccatModel trainCategorizerModel(ObjectStream<DocumentSample> sampleStream) {
        try {
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

        return stemmingTokens(tokens);
    }

    public static String[] stemmingTokens(String[] tokens) {
        SnowballStemmer stemmer = new SnowballStemmer(SnowballStemmer.ALGORITHM.RUSSIAN);

        List<String> stemsList = new ArrayList<>();

        for (String token : tokens) {
            String stem = String.valueOf(stemmer.stem(token));
            stemsList.add(stem);
        }

        String[] stems = stemsList.toArray(new String[0]);
        logger.info("after stemming : " + String.join(" | ", stems));

        return stems;
    }


}
