/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class IncursionsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_FACTION_ID = "faction_id";
    @SerializedName(SERIALIZED_NAME_FACTION_ID)
    private Integer factionId;

    /**
     * The state of this incursion
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        WITHDRAWING("withdrawing"),

        MOBILIZING("mobilizing"),

        ESTABLISHED("established");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private StateEnum state;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_STAGING_SOLAR_SYSTEM_ID = "staging_solar_system_id";
    @SerializedName(SERIALIZED_NAME_STAGING_SOLAR_SYSTEM_ID)
    private Integer stagingSolarSystemId;

    public static final String SERIALIZED_NAME_CONSTELLATION_ID = "constellation_id";
    @SerializedName(SERIALIZED_NAME_CONSTELLATION_ID)
    private Integer constellationId;

    public static final String SERIALIZED_NAME_HAS_BOSS = "has_boss";
    @SerializedName(SERIALIZED_NAME_HAS_BOSS)
    private Boolean hasBoss;

    public static final String SERIALIZED_NAME_INFESTED_SOLAR_SYSTEMS = "infested_solar_systems";
    @SerializedName(SERIALIZED_NAME_INFESTED_SOLAR_SYSTEMS)
    private List<Integer> infestedSolarSystems = new ArrayList<>();

    public static final String SERIALIZED_NAME_INFLUENCE = "influence";
    @SerializedName(SERIALIZED_NAME_INFLUENCE)
    private Float influence;

    public IncursionsResponse factionId(Integer factionId) {
        this.factionId = factionId;
        return this;
    }

    /**
     * The attacking faction&#39;s id
     * 
     * @return factionId
     **/
    @ApiModelProperty(required = true, value = "The attacking faction's id")
    public Integer getFactionId() {
        return factionId;
    }

    public void setFactionId(Integer factionId) {
        this.factionId = factionId;
    }

    public IncursionsResponse state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of this incursion
     * 
     * @return state
     **/
    @ApiModelProperty(required = true, value = "The state of this incursion")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public IncursionsResponse type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of this incursion
     * 
     * @return type
     **/
    @ApiModelProperty(required = true, value = "The type of this incursion")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public IncursionsResponse stagingSolarSystemId(Integer stagingSolarSystemId) {
        this.stagingSolarSystemId = stagingSolarSystemId;
        return this;
    }

    /**
     * Staging solar system for this incursion
     * 
     * @return stagingSolarSystemId
     **/
    @ApiModelProperty(required = true, value = "Staging solar system for this incursion")
    public Integer getStagingSolarSystemId() {
        return stagingSolarSystemId;
    }

    public void setStagingSolarSystemId(Integer stagingSolarSystemId) {
        this.stagingSolarSystemId = stagingSolarSystemId;
    }

    public IncursionsResponse constellationId(Integer constellationId) {
        this.constellationId = constellationId;
        return this;
    }

    /**
     * The constellation id in which this incursion takes place
     * 
     * @return constellationId
     **/
    @ApiModelProperty(required = true, value = "The constellation id in which this incursion takes place")
    public Integer getConstellationId() {
        return constellationId;
    }

    public void setConstellationId(Integer constellationId) {
        this.constellationId = constellationId;
    }

    public IncursionsResponse hasBoss(Boolean hasBoss) {
        this.hasBoss = hasBoss;
        return this;
    }

    /**
     * Whether the final encounter has boss or not
     * 
     * @return hasBoss
     **/
    @ApiModelProperty(required = true, value = "Whether the final encounter has boss or not")
    public Boolean getHasBoss() {
        return hasBoss;
    }

    public void setHasBoss(Boolean hasBoss) {
        this.hasBoss = hasBoss;
    }

    public IncursionsResponse infestedSolarSystems(List<Integer> infestedSolarSystems) {
        this.infestedSolarSystems = infestedSolarSystems;
        return this;
    }

    public IncursionsResponse addInfestedSolarSystemsItem(Integer infestedSolarSystemsItem) {
        this.infestedSolarSystems.add(infestedSolarSystemsItem);
        return this;
    }

    /**
     * A list of infested solar system ids that are a part of this incursion
     * 
     * @return infestedSolarSystems
     **/
    @ApiModelProperty(required = true, value = "A list of infested solar system ids that are a part of this incursion")
    public List<Integer> getInfestedSolarSystems() {
        return infestedSolarSystems;
    }

    public void setInfestedSolarSystems(List<Integer> infestedSolarSystems) {
        this.infestedSolarSystems = infestedSolarSystems;
    }

    public IncursionsResponse influence(Float influence) {
        this.influence = influence;
        return this;
    }

    /**
     * Influence of this incursion as a float from 0 to 1
     * 
     * @return influence
     **/
    @ApiModelProperty(required = true, value = "Influence of this incursion as a float from 0 to 1")
    public Float getInfluence() {
        return influence;
    }

    public void setInfluence(Float influence) {
        this.influence = influence;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IncursionsResponse incursionsResponse = (IncursionsResponse) o;
        return Objects.equals(this.factionId, incursionsResponse.factionId)
                && Objects.equals(this.state, incursionsResponse.state)
                && Objects.equals(this.type, incursionsResponse.type)
                && Objects.equals(this.stagingSolarSystemId, incursionsResponse.stagingSolarSystemId)
                && Objects.equals(this.constellationId, incursionsResponse.constellationId)
                && Objects.equals(this.hasBoss, incursionsResponse.hasBoss)
                && Objects.equals(this.infestedSolarSystems, incursionsResponse.infestedSolarSystems)
                && Objects.equals(this.influence, incursionsResponse.influence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(factionId, state, type, stagingSolarSystemId, constellationId, hasBoss,
                infestedSolarSystems, influence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IncursionsResponse {\n");

        sb.append("    factionId: ").append(toIndentedString(factionId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    stagingSolarSystemId: ").append(toIndentedString(stagingSolarSystemId)).append("\n");
        sb.append("    constellationId: ").append(toIndentedString(constellationId)).append("\n");
        sb.append("    hasBoss: ").append(toIndentedString(hasBoss)).append("\n");
        sb.append("    infestedSolarSystems: ").append(toIndentedString(infestedSolarSystems)).append("\n");
        sb.append("    influence: ").append(toIndentedString(influence)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
