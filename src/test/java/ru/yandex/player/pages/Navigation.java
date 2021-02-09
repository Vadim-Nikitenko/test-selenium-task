package ru.yandex.player.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Navigation extends BasePage {

    private WebDriver driver;

    @FindBy(className = "services-new__more-icons")
    private WebElement moreServicesBtn;

    @FindBy(xpath = "//*[text() = 'Мои покупки']")
    private WebElement myOrders;

    @FindBy(xpath = "//*[text() = 'Фильмы']")
    private WebElement films;

    @FindBy(className = "input__control")
    private WebElement searchInput;

    public Navigation openMyOrders() {
        waitAndClick(myOrders);
        return this;
    }

    public Navigation(WebDriver driver) {
        super(driver);
    }

    public Navigation openFilms() {
        waitAndClick(films);
        return this;
    }

    public Navigation searchFilm(String value) {
        searchInput.sendKeys(value);
        searchInput.sendKeys(Keys.ENTER);
        return this;
    }


}
