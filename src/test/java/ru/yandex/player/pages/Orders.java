package ru.yandex.player.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ru.yandex.player.base.BaseTest.softly;

public class Orders extends BasePage {

    protected WebDriver driver;

    @FindBy(css = ".Image_loaded.EmptyScreen-Image")
    private WebElement emptyOrdersImage;

    @FindBy(xpath = "//*[text() = 'Покупок пока нет']")
    private WebElement noOrdersTitle;

    @FindBy(css = ".Image_loaded.EmptyScreen-Image")
    private WebElement noOrdersDescription;


    public Orders(WebDriver driver) {
        super(driver);
    }

    public Orders checkEmptyOrdersList() {
        softly.assertThat(emptyOrdersImage.isDisplayed()).isTrue();
        softly.assertThat(noOrdersTitle.isDisplayed()).isTrue();
        softly.assertThat(noOrdersDescription.isDisplayed()).isTrue();
        return this;
    }
}
