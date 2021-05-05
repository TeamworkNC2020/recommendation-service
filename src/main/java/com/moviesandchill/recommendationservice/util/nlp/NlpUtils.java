package com.moviesandchill.recommendationservice.util.nlp;

import lombok.extern.log4j.Log4j;
import opennlp.tools.doccat.*;
import opennlp.tools.stemmer.snowball.SnowballStemmer;
import opennlp.tools.tokenize.SimpleTokenizer;
import opennlp.tools.util.ObjectStream;
import opennlp.tools.util.TrainingParameters;
import opennlp.tools.util.model.ModelUtil;

import java.util.ArrayList;
import java.util.List;

@Log4j
public final class NlpUtils {

    private NlpUtils() {
    }

    public static DoccatModel trainCategorizerModel(ObjectStream<DocumentSample> sampleStream) {
        try {
            DoccatFactory factory = new DoccatFactory(new FeatureGenerator[]{new BagOfWordsFeatureGenerator()});

            TrainingParameters params = ModelUtil.createDefaultTrainingParameters();
            params.put(TrainingParameters.CUTOFF_PARAM, 0);
            params.put("PrintMessages", false); // disable messages

            log.info("start training model");
            return DocumentCategorizerME.train("ru", sampleStream, params, factory);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String getBestCategory(DoccatModel model, String[] finalTokens) {
        DocumentCategorizerME myCategorizer = new DocumentCategorizerME(model);
        double[] scores = myCategorizer.categorize(finalTokens);
        return myCategorizer.getBestCategory(scores);
    }

    public static String[] tokenizeSentence(String sentence) {
        SimpleTokenizer myCategorizer = SimpleTokenizer.INSTANCE;

        String[] tokens = myCategorizer.tokenize(sentence);
        log.info("split sentence to tokens : " + String.join(" | ", tokens));

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
        log.info("after stemming : " + String.join(" | ", stems));

        return stems;
    }


}
