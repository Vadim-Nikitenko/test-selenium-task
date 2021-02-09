package ru.yandex.player.pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.yandex.player.model.SearchFilmCard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static ru.yandex.player.base.BaseTest.softly;

public class Search extends BasePage {

    protected WebDriver driver;

    @FindBy(css = ".Feed-Item_type_card")
    private WebElement filmCard;

    @FindBy(css = ".Feed-Item_type_card")
    private List<WebElement> filmCardsList;

    @FindBy(css = ".Feed-Item_type_card .Card-Title .StreamLink")
    private List<WebElement> cardTitle;

    @FindBy(css = ".Feed-Item_type_card .BaseCard-TopReasonText")
    private List<WebElement> cardDescription;


    public Search(WebDriver driver) {
        super(driver);
    }

    public void checkFilmInSearchList(String filmName, String description) {
        waitFor(filmCard);
        SearchFilmCard initialCard = new SearchFilmCard(filmName, description);
        List<SearchFilmCard> searchFilmCardListonPage = new ArrayList<>();
        for (int i = 0; i < filmCardsList.size(); i++) {
            searchFilmCardListonPage.add(new SearchFilmCard(
                    cardTitle.get(i).getText(),
                    cardDescription.get(i).getText()));
        }
        SearchFilmCard resultCard;
        try {
            resultCard = searchFilmCardListonPage
                    .stream()
                    .filter(filmCard -> filmCard.equals(initialCard))
                    .collect(Collectors.toList()).iterator().next();
        } catch (Exception e) {
            throw new NoSuchElementException(
                    String.format("Не удалось найти ни один фильм соответствующий параметрам: %s, %s", filmName, description));
        }

        softly.assertThat(resultCard).isEqualTo(initialCard);
    }

}