
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "provider_item_id",
    "player_id"
})
public class YastationCastCfg {

    @JsonProperty("provider_item_id")
    public String providerItemId;
    @JsonProperty("player_id")
    public String playerId;

}
