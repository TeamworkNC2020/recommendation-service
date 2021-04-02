package com.moviesandchill.recommendationservice.util.recommendation;

import com.moviesandchill.recommendationservice.pojo.UserFilmRating;
import lombok.SneakyThrows;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RecommendationUtilsTest {

    @Test
    public void testRecommendations() {
        String pathname = "src/test/java/com/moviesandchill/recommendationservice/util/recommendation/ratings.csv";
        List<UserFilmRating> userFilmRatings = loadFromFile(pathname);

        List<RecommendedItem> recommendedItems = RecommendationUtils.recommend(userFilmRatings, 2);

        System.out.println(recommendedItems);
    }

    @SneakyThrows
    private List<UserFilmRating> loadFromFile(String pathname) {
        Scanner scanner = new Scanner(new File(pathname));

        List<UserFilmRating> userFilmRatings = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            var lines = line.split(",");
            long userId = Long.parseLong(lines[0]);
            long itemId = Long.parseLong(lines[1]);
            float rating = Float.parseFloat(lines[2]);
            userFilmRatings.add(new UserFilmRating(userId, itemId, rating));
        }
        return userFilmRatings;
    }
}
