package ru.yandex.player.model;

import java.util.Objects;

public class SearchFilmCard {
    private String title;
    private String description;

    public SearchFilmCard(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SearchFilmCard that = (SearchFilmCard) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }

    @Override
    public String toString() {
        return "SearchFilmCard{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
