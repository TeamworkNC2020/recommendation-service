package com.moviesandchill.recommendationservice.util.recommendation;

import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;
import org.apache.mahout.cf.taste.impl.common.FastByIDMap;
import org.apache.mahout.cf.taste.impl.model.GenericDataModel;
import org.apache.mahout.cf.taste.impl.model.GenericPreference;
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
import java.util.stream.Collectors;

@Log4j
public final class RecommendationUtils {

    private static final double THRESHOLD = 0.1;
    private static final int MAX_COUNT_OF_RECOMMENDATIONS = 5; //todo: rename

    private RecommendationUtils() {
    }

    @SneakyThrows
    public static List<RecommendedItem> recommend(List<UserFilmRating> userFilmRatings, long userId) {
        try {
            List<Preference> preferences = mapToPreferences(userFilmRatings);
            DataModel model = createDataModel(preferences);
            CityBlockSimilarity similarity = new CityBlockSimilarity(model);
            UserNeighborhood neighborhood = new ThresholdUserNeighborhood(THRESHOLD, similarity, model);
            UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);
            return recommender.recommend(userId, MAX_COUNT_OF_RECOMMENDATIONS);
        } catch (Exception e) {
            log.error(e);
            return List.of();
        }
    }

    private static List<Preference> mapToPreferences(List<UserFilmRating> ratings) {
        return ratings.stream()
                .map(r -> new GenericPreference(r.getUserId(), r.getFilmId(), r.getRating()))
                .collect(Collectors.toList());
    }

    private static DataModel createDataModel(List<Preference> preferences) {
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
