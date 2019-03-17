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
import net.troja.eve.esi.model.FactionWarfareLeaderboardKills;
import net.troja.eve.esi.model.FactionWarfareLeaderboardVictoryPoints;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class FactionWarfareLeaderboardResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_KILLS = "kills";
    @SerializedName(SERIALIZED_NAME_KILLS)
    private FactionWarfareLeaderboardKills kills = null;

    public static final String SERIALIZED_NAME_VICTORY_POINTS = "victory_points";
    @SerializedName(SERIALIZED_NAME_VICTORY_POINTS)
    private FactionWarfareLeaderboardVictoryPoints victoryPoints = null;

    public FactionWarfareLeaderboardResponse kills(FactionWarfareLeaderboardKills kills) {
        this.kills = kills;
        return this;
    }

    /**
     * Get kills
     * 
     * @return kills
     **/
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareLeaderboardKills getKills() {
        return kills;
    }

    public void setKills(FactionWarfareLeaderboardKills kills) {
        this.kills = kills;
    }

    public FactionWarfareLeaderboardResponse victoryPoints(FactionWarfareLeaderboardVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
        return this;
    }

    /**
     * Get victoryPoints
     * 
     * @return victoryPoints
     **/
    @ApiModelProperty(required = true, value = "")
    public FactionWarfareLeaderboardVictoryPoints getVictoryPoints() {
        return victoryPoints;
    }

    public void setVictoryPoints(FactionWarfareLeaderboardVictoryPoints victoryPoints) {
        this.victoryPoints = victoryPoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FactionWarfareLeaderboardResponse factionWarfareLeaderboardResponse = (FactionWarfareLeaderboardResponse) o;
        return Objects.equals(this.kills, factionWarfareLeaderboardResponse.kills)
                && Objects.equals(this.victoryPoints, factionWarfareLeaderboardResponse.victoryPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kills, victoryPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FactionWarfareLeaderboardResponse {\n");

        sb.append("    kills: ").append(toIndentedString(kills)).append("\n");
        sb.append("    victoryPoints: ").append(toIndentedString(victoryPoints)).append("\n");
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
