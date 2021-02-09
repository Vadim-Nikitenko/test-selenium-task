
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "endTime",
    "type",
    "result",
    "startTime"
})
public class SkippableFragment {

    @JsonProperty("endTime")
    public Integer endTime;
    @JsonProperty("type")
    public String type;
    @JsonProperty("result")
    public String result;
    @JsonProperty("startTime")
    public Integer startTime;

}
