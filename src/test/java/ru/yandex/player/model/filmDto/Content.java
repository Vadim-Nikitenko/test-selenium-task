
package ru.yandex.player.model.filmDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "user_data",
    "request_info",
    "error",
    "apphost-reqid",
    "content"
})
public class Content {

    @JsonProperty("user_data")
    public UserData userData;
    @JsonProperty("request_info")
    public RequestInfo requestInfo;
    @JsonProperty("error")
    public String error;
    @JsonProperty("apphost-reqid")
    public String apphostReqid;
    @JsonProperty("content")
    public Content_ content;

}
