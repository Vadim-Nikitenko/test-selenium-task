
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "with_cmnt",
    "cmnt_id"
})
public class AutoFields {

    @JsonProperty("with_cmnt")
    public Boolean withCmnt;
    @JsonProperty("cmnt_id")
    public String cmntId;

}
