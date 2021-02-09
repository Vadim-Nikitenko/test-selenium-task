package ru.yandex.player.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.player.model.FilmData;

import static ru.yandex.player.base.BaseTest.softly;

public class Film extends BasePage {

    private WebDriver driver;

    @FindBy(css = ".rating-vendor")
    private WebElement rating;

    @FindBy(xpath = "//*[@data-control-name='fullscreen']")
    private WebElement fullscreenBtn;

    @FindBy(css = ".stream-program-title__subtitle")
    private WebElement subtitle;

    @FindBy(xpath = "//*[@aria-label='Остановить']")
    private WebElement pauseBtn;
    @FindBy(css = "._1kRiw4t")
    private WebElement timeline;


    public Film(WebDriver driver) {
        super(driver);
    }

    public FilmData getFilmData() {
        String ratingOnPage = rating.getText();
        String yearOnPage = subtitle.getText().substring(0, 4);
        return new FilmData(ratingOnPage, yearOnPage);
    }

    public Film getFullScreenMode() {
        waitAndClick(fullscreenBtn);
        return this;
    }

    public Film closeFullScreenMode() {
        waitAndClick(fullscreenBtn);
        return this;
    }

    public Film checkVideoIsPlaying() {
        softly.assertThat(pauseBtn.isDisplayed()).isTrue();
        String currentTime = timeline.getText().substring(0, 4);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String initialTime = "00:00";
        softly.assertThat(currentTime).isNotEqualTo(initialTime);
        return this;
    }
}
