
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weight",
    "with_sport_prediction",
    "with_overlay",
    "with_deep_hd",
    "without_timeline"
})
public class Meta {

    @JsonProperty("weight")
    public Integer weight;
    @JsonProperty("with_sport_prediction")
    public Boolean withSportPrediction;
    @JsonProperty("with_overlay")
    public Boolean withOverlay;
    @JsonProperty("with_deep_hd")
    public Boolean withDeepHd;
    @JsonProperty("without_timeline")
    public Boolean withoutTimeline;

}
