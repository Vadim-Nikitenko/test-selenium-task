package ru.yandex.player.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.yandex.player.base.BaseTest;
import ru.yandex.player.pages.Film;
import ru.yandex.player.pages.Main;

import static org.assertj.core.api.Assertions.assertThat;


public class SmokeTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/filmsData.csv", numLinesToSkip = 1, delimiter = (char) '|')
    public void testFirst(String filmName, String filmDescription) {
        assertThat(new Main(driver)
                .openMoreServices()
                .openBroadcast()
                .openLastTab()
                .nav()
                .openMyOrders()
                .orders()
                .checkEmptyOrdersList()
                .nav()
                .openFilms()
                .films()
                .openSecondRowThirdColumnFilm())
                .isEqualTo(new Film(driver).getFilmData());

        new Film(driver)
                .getFullScreenMode()
                .checkVideoIsPlaying()
                .closeFullScreenMode()
                .nav()
                .searchFilm(filmName)
                .search()
                .checkFilmInSearchList(filmName, filmDescription);
    }

}
