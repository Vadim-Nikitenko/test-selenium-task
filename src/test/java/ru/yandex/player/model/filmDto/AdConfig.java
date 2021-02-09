
package ru.yandex.player.model.filmDto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "distr_id",
    "hasPreroll",
    "category",
    "useAdSession",
    "video_content_name",
    "video_content_id",
    "video_genre_name",
    "video_genre_id"
})
public class AdConfig {

    @JsonProperty("distr_id")
    public Integer distrId;
    @JsonProperty("hasPreroll")
    public Boolean hasPreroll;
    @JsonProperty("category")
    public Integer category;
    @JsonProperty("useAdSession")
    public Boolean useAdSession;
    @JsonProperty("video_content_name")
    public String videoContentName;
    @JsonProperty("video_content_id")
    public String videoContentId;
    @JsonProperty("video_genre_name")
    public List<Object> videoGenreName = new ArrayList<Object>();
    @JsonProperty("video_genre_id")
    public List<Object> videoGenreId = new ArrayList<Object>();

}
