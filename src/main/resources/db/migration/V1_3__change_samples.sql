DELETE
FROM message_categorizer_samples
WHERE category != 'greeting'
   OR category != 'conversation-complete';

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-anime', 'хочу посмотреть аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-anime', 'покажи аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-anime', 'посоветуй аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-anime', 'какие посоветуешь аниме ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-anime', 'порекомендуй аниме');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-action', 'хочу посмотреть боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-action', 'покажи боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-action', 'посоветуй боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-action', 'какие посоветуешь боевики ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-action', 'порекомендуй боевики');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-comedy', 'хочу посмотреть комедию');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-comedy', 'покажи комедию');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-comedy', 'посоветуй комедии');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-comedy', 'какие посоветуешь комедии ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-comedy', 'порекомендуй комедию');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-war', 'хочу посмотреть военные фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-war', 'покажи военный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-war', 'посоветуй фильмы про войну');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-war', 'какие посоветуешь военные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-war', 'порекомендуй фильм про войну');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'хочу посмотреть детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'покажи детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'посоветуй фильмы про детективов');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'посоветуй детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'какие посоветуешь детективные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'порекомендуй детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-detective', 'посоветуй фильмы про расследования');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-western', 'хочу посмотреть вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-western', 'покажи вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-western', 'посоветуй вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-western', 'какие посоветуешь вестерны ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-western', 'порекомендуй вестерн');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'хочу посмотреть детский фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'хочу посмотреть фильмы для детей');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'покажи детские фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'посоветуй фильм для маленьких');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'какие посоветуешь кино для детей ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-children', 'порекомендуй детские фильмы');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-documentary', 'хочу посмотреть документальный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-documentary', 'покажи документальное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-documentary', 'посоветуй документалку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-documentary', 'какие посоветуешь документальные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-documentary', 'порекомендуй документальный фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-historical', 'хочу посмотреть исторический фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-historical', 'покажи историческое кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-historical', 'посоветуй фильм , основанный на реальных событиях');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-historical', 'какие посоветуешь исторические фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-historical', 'порекомендуй исторический фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-crime', 'хочу посмотреть криминальный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-crime', 'покажи кино про криминал и бандитов');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-crime', 'посоветуй фильм про криминал');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-crime', 'какие посоветуешь криминальные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-crime', 'порекомендуй криминальный фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-melodrama', 'хочу посмотреть мелодраму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-melodrama', 'посоветуй мелодраму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-melodrama', 'какие посоветуешь мелодрамы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-melodrama', 'порекомендуй мелодраму');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-adventure', 'хочу посмотреть фильмы про приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-adventure', 'покажи кино про путешествия и приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-adventure', 'посоветуй фильмы про приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-adventure', 'какое посоветуешь кино про приключения ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-adventure', 'порекомендуй фильм про приключения');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-thriller', 'хочу посмотреть триллер');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-thriller', 'покажи пугающее и страшное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-thriller', 'посоветуй триллер');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-thriller', 'какие посоветуешь триллеры ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-thriller', 'порекомендуй триллер');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-drama', 'хочу посмотреть драму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-drama', 'покажи грустное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-drama', 'посоветуй драматические фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-drama', 'какие посоветуешь драмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-drama', 'порекомендуй фильм про драму');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-horror', 'хочу посмотреть ужасы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-horror', 'покажи пугающее и страшное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-horror', 'посоветуй ужасы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-horror', 'какие посоветуешь ужасы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-horror', 'порекомендуй ужастики');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-fiction', 'хочу посмотреть фантастику');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-fiction', 'покажи фантастическое кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-fiction', 'посоветуй фантастику');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-fiction', 'какую посоветуешь фантастику ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-fiction', 'порекомендуй фантастику');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-cartoon', 'хочу посмотреть мультфильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-cartoon', 'покажи мультики');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-cartoon', 'посоветуй мультфильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-cartoon', 'какую посоветуешь мультфильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-cartoon', 'порекомендуй мультфильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-short_film', 'хочу посмотреть короткометражку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-short_film', 'покажи короткометражки');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-short_film', 'посоветуй короткометражку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-short_film', 'какую посоветуешь короткометражку ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('genre-short_film', 'порекомендуй короткометражки');
