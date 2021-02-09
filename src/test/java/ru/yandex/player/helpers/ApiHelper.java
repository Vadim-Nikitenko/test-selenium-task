package ru.yandex.player.helpers;

import ru.yandex.player.model.filmDto.FilmInfoResponse;

import static io.restassured.RestAssured.given;
import static ru.yandex.player.base.BaseTest.softly;

public class ApiHelper {

    public static void checkFilmRatingAndReleaseYear(String id, String year, String rating) {
        FilmInfoResponse response = given()
                .body("{player(content_id:\"" + id + "\")}")
                .when()
                .get("")
                .then()
                .extract()
                .body()
                .as(FilmInfoResponse.class);
        softly.assertThat(response.player.content.content.releaseYear.toString()).isEqualTo(year);
        softly.assertThat(response.player.content.content.ratingKp.toString()).isEqualTo(rating);
    }
}
