package sample.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FILM")
public class Film {

    @Id
    @Column(name = "FILM_ID")
    @JsonProperty("FILM_ID")
    Short filmId;

    @Column(name = "TITLE")
    @JsonProperty("TITLE")
    String title;

    @Column(name = "DESCRIPTION")
    @JsonProperty("DESCRIPTION")
    String description;

    @Column(name = "RELEASE_YEAR")
    @JsonProperty("RELEASE_YEAR")
    @Temporal(TemporalType.DATE)
    Date releaseYear;

    @Column(name = "LANGUAGE_ID")
    @JsonProperty("LANGUAGE_ID")
    Short languageId;

    @Column(name = "ORIGINAL_LANGUAGE_ID")
    @JsonProperty("ORIGINAL_LANGUAGE_ID")
    Short originalLanguageId;

    @Column(name = "RENTAL_DURATION")
    @JsonProperty("RENTAL_DURATION")
    Short rentalDuration;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RENTAL_RATE")
    @JsonProperty("RENTAL_RATE")
    BigDecimal rentalRate;

    @Column(name = "LENGTH")
    @JsonProperty("LENGTH")
    Short length;

    @Column(name = "REPLACEMENT_COST")
    @JsonProperty("REPLACEMENT_COST")
    BigDecimal replacementCost;

    @Column(name = "RATING")
    @JsonProperty("RATING")
    String rating;

    @Column(name = "SPECIAL_FEATURES")
    @JsonProperty("SPECIAL_FEATURES")
    String specialFeatures;

    @Column(name = "LAST_UPDATE")
    @JsonProperty("LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    Date lastUpdate;

    @Column(name = "AVAILABLE")
    @JsonProperty("AVAILABLE")
    Boolean available;

    public Film() {
    }

}
