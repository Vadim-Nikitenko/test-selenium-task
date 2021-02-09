
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
    "flags",
    "test_ids",
    "cuid",
    "use_aab_bundle",
    "slow_connection",
    "with_ad_insertion"
})
public class RequestInfo {

    @JsonProperty("flags")
    public String flags;
    @JsonProperty("test_ids")
    public List<Object> testIds = new ArrayList<Object>();
    @JsonProperty("cuid")
    public String cuid;
    @JsonProperty("use_aab_bundle")
    public Boolean useAabBundle;
    @JsonProperty("slow_connection")
    public Boolean slowConnection;
    @JsonProperty("with_ad_insertion")
    public Boolean withAdInsertion;

}
