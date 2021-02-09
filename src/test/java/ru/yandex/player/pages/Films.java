package ru.yandex.player.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.player.model.FilmData;

public class Films extends BasePage {

    private WebDriver driver;

    @FindBy(xpath = "((//*[contains(@class, 'Feed-Item')])[2]//*[contains(@class, 'Card_link')])[3]")
    private WebElement secondRowThirdColumnFilm;

    public Films(WebDriver driver) {
        super(driver);
    }

    public FilmData openSecondRowThirdColumnFilm() {
        String rating = secondRowThirdColumnFilm.findElement(By.cssSelector(".Card-RatingItem")).getText();
        String year = secondRowThirdColumnFilm.findElement(By.cssSelector(".BaseCard-TopReasonText")).getText().substring(0, 4);
        waitAndClick(secondRowThirdColumnFilm);
        return new FilmData(rating, year);
    }
}
