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
import java.time.OffsetDateTime;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterAttributesResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LAST_REMAP_DATE = "last_remap_date";
    @SerializedName(SERIALIZED_NAME_LAST_REMAP_DATE)
    private OffsetDateTime lastRemapDate;

    public static final String SERIALIZED_NAME_MEMORY = "memory";
    @SerializedName(SERIALIZED_NAME_MEMORY)
    private Integer memory;

    public static final String SERIALIZED_NAME_WILLPOWER = "willpower";
    @SerializedName(SERIALIZED_NAME_WILLPOWER)
    private Integer willpower;

    public static final String SERIALIZED_NAME_BONUS_REMAPS = "bonus_remaps";
    @SerializedName(SERIALIZED_NAME_BONUS_REMAPS)
    private Integer bonusRemaps;

    public static final String SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE = "accrued_remap_cooldown_date";
    @SerializedName(SERIALIZED_NAME_ACCRUED_REMAP_COOLDOWN_DATE)
    private OffsetDateTime accruedRemapCooldownDate;

    public static final String SERIALIZED_NAME_CHARISMA = "charisma";
    @SerializedName(SERIALIZED_NAME_CHARISMA)
    private Integer charisma;

    public static final String SERIALIZED_NAME_INTELLIGENCE = "intelligence";
    @SerializedName(SERIALIZED_NAME_INTELLIGENCE)
    private Integer intelligence;

    public static final String SERIALIZED_NAME_PERCEPTION = "perception";
    @SerializedName(SERIALIZED_NAME_PERCEPTION)
    private Integer perception;

    public CharacterAttributesResponse lastRemapDate(OffsetDateTime lastRemapDate) {
        this.lastRemapDate = lastRemapDate;
        return this;
    }

    /**
     * Datetime of last neural remap, including usage of bonus remaps
     * 
     * @return lastRemapDate
     **/
    @ApiModelProperty(value = "Datetime of last neural remap, including usage of bonus remaps")
    public OffsetDateTime getLastRemapDate() {
        return lastRemapDate;
    }

    public void setLastRemapDate(OffsetDateTime lastRemapDate) {
        this.lastRemapDate = lastRemapDate;
    }

    public CharacterAttributesResponse memory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * memory integer
     * 
     * @return memory
     **/
    @ApiModelProperty(required = true, value = "memory integer")
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public CharacterAttributesResponse willpower(Integer willpower) {
        this.willpower = willpower;
        return this;
    }

    /**
     * willpower integer
     * 
     * @return willpower
     **/
    @ApiModelProperty(required = true, value = "willpower integer")
    public Integer getWillpower() {
        return willpower;
    }

    public void setWillpower(Integer willpower) {
        this.willpower = willpower;
    }

    public CharacterAttributesResponse bonusRemaps(Integer bonusRemaps) {
        this.bonusRemaps = bonusRemaps;
        return this;
    }

    /**
     * Number of available bonus character neural remaps
     * 
     * @return bonusRemaps
     **/
    @ApiModelProperty(value = "Number of available bonus character neural remaps")
    public Integer getBonusRemaps() {
        return bonusRemaps;
    }

    public void setBonusRemaps(Integer bonusRemaps) {
        this.bonusRemaps = bonusRemaps;
    }

    public CharacterAttributesResponse accruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
        this.accruedRemapCooldownDate = accruedRemapCooldownDate;
        return this;
    }

    /**
     * Neural remapping cooldown after a character uses remap accrued over time
     * 
     * @return accruedRemapCooldownDate
     **/
    @ApiModelProperty(value = "Neural remapping cooldown after a character uses remap accrued over time")
    public OffsetDateTime getAccruedRemapCooldownDate() {
        return accruedRemapCooldownDate;
    }

    public void setAccruedRemapCooldownDate(OffsetDateTime accruedRemapCooldownDate) {
        this.accruedRemapCooldownDate = accruedRemapCooldownDate;
    }

    public CharacterAttributesResponse charisma(Integer charisma) {
        this.charisma = charisma;
        return this;
    }

    /**
     * charisma integer
     * 
     * @return charisma
     **/
    @ApiModelProperty(required = true, value = "charisma integer")
    public Integer getCharisma() {
        return charisma;
    }

    public void setCharisma(Integer charisma) {
        this.charisma = charisma;
    }

    public CharacterAttributesResponse intelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    /**
     * intelligence integer
     * 
     * @return intelligence
     **/
    @ApiModelProperty(required = true, value = "intelligence integer")
    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public CharacterAttributesResponse perception(Integer perception) {
        this.perception = perception;
        return this;
    }

    /**
     * perception integer
     * 
     * @return perception
     **/
    @ApiModelProperty(required = true, value = "perception integer")
    public Integer getPerception() {
        return perception;
    }

    public void setPerception(Integer perception) {
        this.perception = perception;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAttributesResponse characterAttributesResponse = (CharacterAttributesResponse) o;
        return Objects.equals(this.lastRemapDate, characterAttributesResponse.lastRemapDate)
                && Objects.equals(this.memory, characterAttributesResponse.memory)
                && Objects.equals(this.willpower, characterAttributesResponse.willpower)
                && Objects.equals(this.bonusRemaps, characterAttributesResponse.bonusRemaps)
                && Objects.equals(this.accruedRemapCooldownDate, characterAttributesResponse.accruedRemapCooldownDate)
                && Objects.equals(this.charisma, characterAttributesResponse.charisma)
                && Objects.equals(this.intelligence, characterAttributesResponse.intelligence)
                && Objects.equals(this.perception, characterAttributesResponse.perception);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastRemapDate, memory, willpower, bonusRemaps, accruedRemapCooldownDate, charisma,
                intelligence, perception);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAttributesResponse {\n");

        sb.append("    lastRemapDate: ").append(toIndentedString(lastRemapDate)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    willpower: ").append(toIndentedString(willpower)).append("\n");
        sb.append("    bonusRemaps: ").append(toIndentedString(bonusRemaps)).append("\n");
        sb.append("    accruedRemapCooldownDate: ").append(toIndentedString(accruedRemapCooldownDate)).append("\n");
        sb.append("    charisma: ").append(toIndentedString(charisma)).append("\n");
        sb.append("    intelligence: ").append(toIndentedString(intelligence)).append("\n");
        sb.append("    perception: ").append(toIndentedString(perception)).append("\n");
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
