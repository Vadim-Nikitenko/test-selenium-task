
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "can_upload",
    "subscribe_id",
    "title",
    "id"
})
public class Theme {

    @JsonProperty("can_upload")
    public Boolean canUpload;
    @JsonProperty("subscribe_id")
    public String subscribeId;
    @JsonProperty("title")
    public String title;
    @JsonProperty("id")
    public String id;

}
