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
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class SystemKillsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_NPC_KILLS = "npc_kills";
    @SerializedName(SERIALIZED_NAME_NPC_KILLS)
    private Integer npcKills;

    public static final String SERIALIZED_NAME_SHIP_KILLS = "ship_kills";
    @SerializedName(SERIALIZED_NAME_SHIP_KILLS)
    private Integer shipKills;

    public static final String SERIALIZED_NAME_SYSTEM_ID = "system_id";
    @SerializedName(SERIALIZED_NAME_SYSTEM_ID)
    private Integer systemId;

    public static final String SERIALIZED_NAME_POD_KILLS = "pod_kills";
    @SerializedName(SERIALIZED_NAME_POD_KILLS)
    private Integer podKills;

    public SystemKillsResponse npcKills(Integer npcKills) {
        this.npcKills = npcKills;
        return this;
    }

    /**
     * Number of NPC ships killed in this system
     * 
     * @return npcKills
     **/
    @ApiModelProperty(required = true, value = "Number of NPC ships killed in this system")
    public Integer getNpcKills() {
        return npcKills;
    }

    public void setNpcKills(Integer npcKills) {
        this.npcKills = npcKills;
    }

    public SystemKillsResponse shipKills(Integer shipKills) {
        this.shipKills = shipKills;
        return this;
    }

    /**
     * Number of player ships killed in this system
     * 
     * @return shipKills
     **/
    @ApiModelProperty(required = true, value = "Number of player ships killed in this system")
    public Integer getShipKills() {
        return shipKills;
    }

    public void setShipKills(Integer shipKills) {
        this.shipKills = shipKills;
    }

    public SystemKillsResponse systemId(Integer systemId) {
        this.systemId = systemId;
        return this;
    }

    /**
     * system_id integer
     * 
     * @return systemId
     **/
    @ApiModelProperty(required = true, value = "system_id integer")
    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public SystemKillsResponse podKills(Integer podKills) {
        this.podKills = podKills;
        return this;
    }

    /**
     * Number of pods killed in this system
     * 
     * @return podKills
     **/
    @ApiModelProperty(required = true, value = "Number of pods killed in this system")
    public Integer getPodKills() {
        return podKills;
    }

    public void setPodKills(Integer podKills) {
        this.podKills = podKills;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SystemKillsResponse systemKillsResponse = (SystemKillsResponse) o;
        return Objects.equals(this.npcKills, systemKillsResponse.npcKills)
                && Objects.equals(this.shipKills, systemKillsResponse.shipKills)
                && Objects.equals(this.systemId, systemKillsResponse.systemId)
                && Objects.equals(this.podKills, systemKillsResponse.podKills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(npcKills, shipKills, systemId, podKills);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SystemKillsResponse {\n");

        sb.append("    npcKills: ").append(toIndentedString(npcKills)).append("\n");
        sb.append("    shipKills: ").append(toIndentedString(shipKills)).append("\n");
        sb.append("    systemId: ").append(toIndentedString(systemId)).append("\n");
        sb.append("    podKills: ").append(toIndentedString(podKills)).append("\n");
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
