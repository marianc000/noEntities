package sample.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
 

public class Film2 {

    public Film2(Object filmId, Object title, Object description, Object releaseYear, Object languageId, Object originalLanguageId, Object rentalDuration,
            Object rentalRate, Object length, Object replacementCost,
            Object rating, Object specialFeatures, Object lastUpdate, Object available) {
        this.filmId = filmId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.languageId = languageId;
        this.originalLanguageId = originalLanguageId;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;
        this.available = available;
    }

    @JsonProperty("FILM_ID")
    Object filmId;

    @JsonProperty("TITLE")
    Object title;

    @JsonProperty("DESCRIPTION")
    Object description;

    @JsonProperty("RELEASE_YEAR")
    Object releaseYear;

    @JsonProperty("LANGUAGE_ID")
    Object languageId;

    @JsonProperty("ORIGINAL_LANGUAGE_ID")
    Object originalLanguageId;

    @JsonProperty("RENTAL_DURATION")
    Object rentalDuration;

    @JsonProperty("RENTAL_RATE")
    Object rentalRate;

    @JsonProperty("LENGTH")
    Object length;

    @JsonProperty("REPLACEMENT_COST")
    Object replacementCost;

    @JsonProperty("RATING")
    Object rating;

    @JsonProperty("SPECIAL_FEATURES")
    Object specialFeatures;

    @JsonProperty("LAST_UPDATE")
    Object lastUpdate;

    @JsonProperty("AVAILABLE")
    Object available;

}
