
package ru.yandex.player.model.filmDto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "brand-safety-categories"
})
public class AdTags {
    @JsonIgnore
    @JsonProperty("brand-safety-categories")
    public List<String> brandSafetyCategories = new ArrayList<String>();

}
