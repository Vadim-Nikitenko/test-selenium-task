package ru.yandex.player.model;

import java.util.Objects;

public class FilmData {
    private String rating;
    private String year;

    public FilmData(String rating, String year) {
        this.rating = rating;
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public String getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FilmData filmData = (FilmData) o;
        return Objects.equals(rating, filmData.rating) &&
                Objects.equals(year, filmData.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rating, year);
    }

    @Override
    public String toString() {
        return "FilmData{" +
                "rating='" + rating + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
