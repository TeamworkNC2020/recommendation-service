package com.moviesandchill.recommendationservice.util.recommendation;

import lombok.extern.log4j.Log4j;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericUserPreferenceArray;
import org.apache.mahout.cf.taste.impl.neighborhood.ThresholdUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.CityBlockSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.model.Preference;
import org.apache.mahout.cf.taste.model.PreferenceArray;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Log4j
public final class RecommendationUtils {

    private RecommendationUtils() {
    }

    public static List<RecommendedItem> recommend(List<Preference> preferences) {
        DataModel model = createDataModel(preferences);
        CityBlockSimilarity similarity = new CityBlockSimilarity(model);
        UserNeighborhood neighborhood = new ThresholdUserNeighborhood(0.1, similarity, model);
        UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        // The First argument is the userID and the Second parameter is 'HOW MANY'
        List<RecommendedItem> recommendations = null;
        try {
            recommendations = recommender.recommend(2, 2);
        } catch (TasteException e) {
            e.printStackTrace();
        }

        return recommendations;
    }

    public static DataModel createDataModel(List<Preference> preferences) {
        Map<Long, List<Preference>> usersPreferences = new HashMap<>();
        for (var preference : preferences) {
            var userId = preference.getUserID();

            if (!usersPreferences.containsKey(userId)) {
                ArrayList<Preference> newPreferenceList = new ArrayList<>();
                newPreferenceList.add(preference);
                usersPreferences.put(userId, newPreferenceList);
            } else {
                usersPreferences.get(userId).add(preference);
            }
        }

        FastByIDMap<PreferenceArray> fastByIDMap = new FastByIDMap<>();
        for (var entry : usersPreferences.entrySet()) {
            var userId = entry.getKey();
            var userPreferences = entry.getValue();
            fastByIDMap.put(userId, new GenericUserPreferenceArray(userPreferences));
        }

        return new GenericDataModel(fastByIDMap);
    }

}
