package ru.yandex.player.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.player.helpers.ApiHelper;
import ru.yandex.player.model.FilmData;

public class Films extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "((//*[contains(@class, 'Feed-Item')])[2]//*[contains(@class, 'Card_link')])[3]")
    private WebElement secondRowThirdColumnFilm;

    @FindBy(xpath = "((//*[contains(@class, 'Feed-Item')])[2]//a[contains(@class, 'StreamLink_block')])[3]")
    private WebElement secondRowThirdColumnFilmHref;

    public Films(WebDriver driver) {
        super(driver);
    }

    public FilmData openSecondRowThirdColumnFilm() {
        String rating = secondRowThirdColumnFilm.findElement(By.cssSelector(".Card-RatingItem")).getText();
        String year = secondRowThirdColumnFilm.findElement(By.cssSelector(".BaseCard-TopReasonText")).getText().substring(0, 4);
        String id = StringUtils.substringBetween(secondRowThirdColumnFilmHref.getAttribute("href"), "id=", "&");
        ApiHelper.checkFilmRatingAndReleaseYear(id, year, rating);
        waitAndClick(secondRowThirdColumnFilm);
        return new FilmData(rating, year);
    }

}
