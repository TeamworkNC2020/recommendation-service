package com.moviesandchill.recommendationservice.util.recommendation;

import org.apache.mahout.cf.taste.impl.model.GenericPreference;
import org.apache.mahout.cf.taste.model.Preference;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RecommendationUtilsTest {

    @Test
    public void testRecommendations() throws FileNotFoundException {
        List<Preference> preferences = new ArrayList<>();

        String pathname = "src/test/java/com/moviesandchill/recommendationservice/util/recommendation/ratings.csv";
        Scanner scanner = new Scanner(new File(pathname));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            var sublines = line.split(",");

            long userId = Long.parseLong(sublines[0]);
            long itemId = Long.parseLong(sublines[1]);
            float rating = Float.parseFloat(sublines[2]);

            preferences.add(new GenericPreference(userId, itemId, rating));
        }

        List<RecommendedItem> recommendedItems = RecommendationUtils.recommend(preferences);

        //TODO write asserts
        System.out.println(recommendedItems);
    }
}