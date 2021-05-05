-- noinspection SqlWithoutWhereForFile

DELETE
FROM message_categorizer_samples;



INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-start', 'привет !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-start', 'добрый день !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-start', 'здравствуйте !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-start', 'привет ! как дела ?');


INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'пока !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'до свидания !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'до встречи !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'еще увидимся !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'до связи !');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('conversation-complete', 'спасибо за все ');



INSERT INTO message_categorizer_samples (category, text)
VALUES ('recommend-anything', 'порекомендуй что-нибудь');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('recommend-anything', 'посоветуй что-нибудь');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('recommend-anything', 'покажи фильм');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('recommend-anything', 'посоветуй кино');

INSERT INTO message_categorizer_samples (category, text)
VALUES ('recommend-anything', 'какие посоветуешь фильмы');



INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-anime', 'хочу посмотреть аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-anime', 'покажи аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-anime', 'посоветуй аниме');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-anime', 'какие посоветуешь аниме ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-anime', 'порекомендуй аниме');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-action', 'хочу посмотреть боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-action', 'покажи боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-action', 'посоветуй боевик');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-action', 'какие посоветуешь боевики ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-action', 'порекомендуй боевики');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-comedy', 'хочу посмотреть комедию');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-comedy', 'покажи комедию');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-comedy', 'посоветуй комедии');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-comedy', 'какие посоветуешь комедии ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-comedy', 'порекомендуй комедию');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-war', 'хочу посмотреть военные фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-war', 'покажи военный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-war', 'посоветуй фильмы про войну');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-war', 'какие посоветуешь военные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-war', 'порекомендуй фильм про войну');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'хочу посмотреть детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'покажи детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'посоветуй фильмы про детективов');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'посоветуй детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'какие посоветуешь детективные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'порекомендуй детектив');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-detective', 'посоветуй фильмы про расследования');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-western', 'хочу посмотреть вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-western', 'покажи вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-western', 'посоветуй вестерн');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-western', 'какие посоветуешь вестерны ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-western', 'порекомендуй вестерн');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'хочу посмотреть детский фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'хочу посмотреть фильмы для детей');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'покажи детские фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'посоветуй фильм для маленьких');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'какие посоветуешь кино для детей ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-children', 'порекомендуй детские фильмы');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-documentary', 'хочу посмотреть документальный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-documentary', 'покажи документальное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-documentary', 'посоветуй документалку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-documentary', 'какие посоветуешь документальные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-documentary', 'порекомендуй документальный фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-historical', 'хочу посмотреть исторический фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-historical', 'покажи историческое кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-historical', 'посоветуй фильм , основанный на реальных событиях');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-historical', 'какие посоветуешь исторические фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-historical', 'порекомендуй исторический фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-crime', 'хочу посмотреть криминальный фильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-crime', 'покажи кино про криминал и бандитов');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-crime', 'посоветуй фильм про криминал');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-crime', 'какие посоветуешь криминальные фильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-crime', 'порекомендуй криминальный фильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-melodrama', 'хочу посмотреть мелодраму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-melodrama', 'посоветуй мелодраму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-melodrama', 'какие посоветуешь мелодрамы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-melodrama', 'порекомендуй мелодраму');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-adventure', 'хочу посмотреть фильмы про приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-adventure', 'покажи кино про путешествия и приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-adventure', 'посоветуй фильмы про приключения');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-adventure', 'какое посоветуешь кино про приключения ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-adventure', 'порекомендуй фильм про приключения');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-thriller', 'хочу посмотреть триллер');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-thriller', 'покажи пугающее и страшное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-thriller', 'посоветуй триллер');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-thriller', 'какие посоветуешь триллеры ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-thriller', 'порекомендуй триллер');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-drama', 'хочу посмотреть драму');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-drama', 'покажи грустное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-drama', 'посоветуй драматические фильмы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-drama', 'какие посоветуешь драмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-drama', 'порекомендуй фильм про драму');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-horror', 'хочу посмотреть ужасы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-horror', 'покажи пугающее и страшное кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-horror', 'посоветуй ужасы');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-horror', 'какие посоветуешь ужасы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-horror', 'порекомендуй ужастики');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-fiction', 'хочу посмотреть фантастику');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-fiction', 'покажи фантастическое кино');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-fiction', 'посоветуй фантастику');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-fiction', 'какую посоветуешь фантастику ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-fiction', 'порекомендуй фантастику');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-cartoon', 'хочу посмотреть мультфильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-cartoon', 'покажи мультики');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-cartoon', 'посоветуй мультфильм');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-cartoon', 'какую посоветуешь мультфильмы ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-cartoon', 'порекомендуй мультфильм');


INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-short_film', 'хочу посмотреть короткометражку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-short_film', 'покажи короткометражки');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-short_film', 'посоветуй короткометражку');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-short_film', 'какую посоветуешь короткометражку ?');

INSERT INTO message_categorizer_samples(category, text)
VALUES ('recommend-by-genre-short_film', 'порекомендуй короткометражки');
