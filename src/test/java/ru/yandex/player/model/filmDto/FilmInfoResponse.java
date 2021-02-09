
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "player",
    "apphost-reqid",
    "doc2doc"
})
public class FilmInfoResponse {

    @JsonProperty("player")
    public Player player;
    @JsonIgnore
    @JsonProperty("apphost-reqid")
    public String apphostReqid;
    @JsonIgnore
    @JsonProperty("doc2doc")
    public Doc2doc doc2doc;

}
