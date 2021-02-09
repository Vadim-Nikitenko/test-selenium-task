
package ru.yandex.player.model.filmDto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.*;
import ru.yandex.player.model.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "parent_id",
    "catchup_age",
    "supertag",
    "channel_multiplex_number",
    "sport_event",
    "download_episodes",
    "content_url",
    "title",
    "themes",
    "supertag_title",
    "stream",
    "height",
    "rating_kp",
    "actors",
    "auto_fields",
    "thumbnail",
    "meta",
    "content_id",
    "skippableFragments",
    "adTags",
    "stream_quality",
    "cover",
    "adConfig",
    "watermark_logo",
    "release_year",
    "onto_id",
    "views_count",
    "embed_url",
    "main_color",
    "can_play_on_station",
    "directors",
    "ya_plus",
    "onto_otype",
    "producers",
    "update_time",
    "has_cachup",
    "ottParams",
    "countries",
    "dislikes",
    "deep_hd",
    "is_special_project",
    "short_description",
    "yastation_cast_cfg",
    "computed_title",
    "has_vod",
    "width",
    "dvr",
    "likes",
    "ya_video_preview",
    "streams",
    "onto_poster",
    "restriction_age",
    "content_type_name",
    "blacked",
    "onto_category",
    "logo",
    "duration",
    "can_play_on_efir",
    "genres",
    "has_schedule",
    "description"
})
public class Content_ {
    @JsonIgnore
    @JsonProperty("parent_id")
    public String parentId;
    @JsonIgnore
    @JsonProperty("catchup_age")
    public Integer catchupAge;
    @JsonIgnore
    @JsonProperty("supertag")
    public String supertag;
    @JsonProperty("channel_multiplex_number")
    @JsonIgnore
    public Integer channelMultiplexNumber;
    @JsonProperty("sport_event")
    @JsonIgnore
    public SportEvent sportEvent;
    @JsonProperty("download_episodes")
    @JsonIgnore
    public Integer downloadEpisodes;
    @JsonIgnore
    @JsonProperty("content_url")
    public String contentUrl;
    @JsonIgnore
    @JsonProperty("title")
    public String title;
    @JsonIgnore
    @JsonProperty("themes")
    public List<Theme> themes = new ArrayList<Theme>();
    @JsonIgnore
    @JsonProperty("supertag_title")
    public String supertagTitle;
    @JsonIgnore
    @JsonProperty("stream")
    public Stream stream;
    @JsonIgnore
    @JsonProperty("height")
    public Integer height;
    @JsonProperty("rating_kp")
    public Double ratingKp;
    @JsonIgnore
    @JsonProperty("actors")
    public String actors;
    @JsonIgnore
    @JsonProperty("auto_fields")
    public AutoFields autoFields;
    @JsonIgnore
    @JsonProperty("thumbnail")
    public String thumbnail;
    @JsonIgnore
    @JsonProperty("meta")
    public Meta meta;
    @JsonIgnore
    @JsonProperty("content_id")
    public String contentId;
    @JsonIgnore
    @JsonProperty("skippableFragments")
    public List<SkippableFragment> skippableFragments = new ArrayList<SkippableFragment>();
    @JsonIgnore
    @JsonProperty("adTags")
    public AdTags adTags;
    @JsonIgnore
    @JsonProperty("stream_quality")
    public String streamQuality;
    @JsonIgnore
    @JsonProperty("cover")
    public String cover;
    @JsonIgnore
    @JsonProperty("adConfig")
    public AdConfig adConfig;
    @JsonIgnore
    @JsonProperty("watermark_logo")
    public String watermarkLogo;
    @JsonProperty("release_year")
    public Integer releaseYear;
    @JsonIgnore
    @JsonProperty("onto_id")
    public String ontoId;
    @JsonIgnore
    @JsonProperty("views_count")
    public Integer viewsCount;
    @JsonIgnore
    @JsonProperty("embed_url")
    public String embedUrl;
    @JsonIgnore
    @JsonProperty("main_color")
    public String mainColor;
    @JsonIgnore
    @JsonProperty("can_play_on_station")
    public Boolean canPlayOnStation;
    @JsonIgnore
    @JsonProperty("directors")
    public String directors;
    @JsonIgnore
    @JsonProperty("ya_plus")
    public List<String> yaPlus = new ArrayList<String>();
    @JsonIgnore
    @JsonProperty("onto_otype")
    public String ontoOtype;
    @JsonIgnore
    @JsonProperty("producers")
    public String producers;
    @JsonIgnore
    @JsonProperty("update_time")
    public Integer updateTime;
    @JsonIgnore
    @JsonProperty("has_cachup")
    public Integer hasCachup;
    @JsonIgnore
    @JsonProperty("ottParams")
    public OttParams ottParams;
    @JsonIgnore
    @JsonProperty("countries")
    public String countries;
    @JsonIgnore
    @JsonProperty("dislikes")
    public Integer dislikes;
    @JsonIgnore
    @JsonProperty("deep_hd")
    public Boolean deepHd;
    @JsonIgnore
    @JsonProperty("is_special_project")
    public Boolean isSpecialProject;
    @JsonIgnore
    @JsonProperty("short_description")
    public String shortDescription;
    @JsonIgnore
    @JsonProperty("yastation_cast_cfg")
    public YastationCastCfg yastationCastCfg;
    @JsonIgnore
    @JsonProperty("computed_title")
    public String computedTitle;
    @JsonIgnore
    @JsonProperty("has_vod")
    public Integer hasVod;
    @JsonIgnore
    @JsonProperty("width")
    public Integer width;
    @JsonIgnore
    @JsonProperty("dvr")
    public Integer dvr;
    @JsonIgnore
    @JsonProperty("likes")
    public Integer likes;
    @JsonIgnore
    @JsonProperty("ya_video_preview")
    public String yaVideoPreview;
    @JsonIgnore
    @JsonProperty("streams")
    public List<Stream_> streams = new ArrayList<Stream_>();
    @JsonIgnore
    @JsonProperty("onto_poster")
    public String ontoPoster;
    @JsonIgnore
    @JsonProperty("restriction_age")
    public Integer restrictionAge;
    @JsonIgnore
    @JsonProperty("content_type_name")
    public String contentTypeName;
    @JsonIgnore
    @JsonProperty("blacked")
    public Integer blacked;
    @JsonIgnore
    @JsonProperty("onto_category")
    public String ontoCategory;
    @JsonIgnore
    @JsonProperty("logo")
    public String logo;
    @JsonIgnore
    @JsonProperty("duration")
    public Integer duration;
    @JsonIgnore
    @JsonProperty("can_play_on_efir")
    public Boolean canPlayOnEfir;
    @JsonIgnore
    @JsonProperty("genres")
    public List<String> genres = new ArrayList<String>();
    @JsonIgnore
    @JsonProperty("has_schedule")
    public Integer hasSchedule;
    @JsonIgnore
    @JsonProperty("description")
    public String description;

}
