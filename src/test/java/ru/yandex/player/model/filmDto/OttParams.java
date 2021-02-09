
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "monetizationModel",
    "serviceName",
    "contentTypeID",
    "kpId",
    "reqid",
    "yandexuid",
    "uuid",
    "from"
})
public class OttParams {

    @JsonProperty("monetizationModel")
    public String monetizationModel;
    @JsonProperty("serviceName")
    public String serviceName;
    @JsonProperty("contentTypeID")
    public Integer contentTypeID;
    @JsonProperty("kpId")
    public String kpId;
    @JsonProperty("reqid")
    public String reqid;
    @JsonProperty("yandexuid")
    public String yandexuid;
    @JsonProperty("uuid")
    public String uuid;
    @JsonProperty("from")
    public String from;

}
