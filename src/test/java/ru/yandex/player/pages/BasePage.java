package ru.yandex.player.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class BasePage {
    protected WebDriver driver;
    private WebDriverWait wait;
    private Navigation navigation;
    private Films films;
    private Film film;
    private Search search;
    private Orders orders;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);
    }

    public void waitAndClick(WebElement webElement) {
        wait.until(ExpectedConditions.visibilityOf(webElement));
        webElement.click();
    }

    public void waitFor(WebElement webElement) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public BasePage openLastTab() {
        ArrayList<String> tab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(tab.size() - 1));
        return this;
    }

    public Navigation nav() {
        return new Navigation(driver);
    }

    public Films films() {
        return new Films(driver);
    }

    public Film film() {
        return new Film(driver);
    }

    public Search search() {
        return new Search(driver);
    }

    public Orders orders() {
        return new Orders(driver);
    }
}
