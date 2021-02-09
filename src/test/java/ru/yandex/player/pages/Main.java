package ru.yandex.player.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main extends BasePage {
    protected WebDriver driver;
    private Navigation navigation;

    @FindBy(className = "services-new__more-icons")
    private WebElement moreServicesBtn;

    @FindBy(xpath = "//*[@data-id='tvonline']")
    private WebElement broadcastBtn;

    public Main(WebDriver driver) {
        super(driver);
        navigation = new Navigation(driver);
    }

    public Main openMoreServices() {
        waitAndClick(moreServicesBtn);
        return this;
    }

    public Main openBroadcast() {
        waitAndClick(broadcastBtn);
        return this;
    }

    public Navigation nav() {
        return navigation;
    }
}
