/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
public class CharacterAssetsResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("is_singleton")
    private Boolean isSingleton = null;

    @JsonProperty("item_id")
    private Long itemId = null;

    /**
     * location_flag string
     */
    public enum LocationFlagEnum {
        ASSETSAFETY("AssetSafety"),

        AUTOFIT("AutoFit"),

        CARGO("Cargo"),

        CORPSEBAY("CorpseBay"),

        DELIVERIES("Deliveries"),

        DRONEBAY("DroneBay"),

        FIGHTERBAY("FighterBay"),

        FIGHTERTUBE0("FighterTube0"),

        FIGHTERTUBE1("FighterTube1"),

        FIGHTERTUBE2("FighterTube2"),

        FIGHTERTUBE3("FighterTube3"),

        FIGHTERTUBE4("FighterTube4"),

        FLEETHANGAR("FleetHangar"),

        HANGAR("Hangar"),

        HANGARALL("HangarAll"),

        HISLOT0("HiSlot0"),

        HISLOT1("HiSlot1"),

        HISLOT2("HiSlot2"),

        HISLOT3("HiSlot3"),

        HISLOT4("HiSlot4"),

        HISLOT5("HiSlot5"),

        HISLOT6("HiSlot6"),

        HISLOT7("HiSlot7"),

        HIDDENMODIFIERS("HiddenModifiers"),

        IMPLANT("Implant"),

        LOSLOT0("LoSlot0"),

        LOSLOT1("LoSlot1"),

        LOSLOT2("LoSlot2"),

        LOSLOT3("LoSlot3"),

        LOSLOT4("LoSlot4"),

        LOSLOT5("LoSlot5"),

        LOSLOT6("LoSlot6"),

        LOSLOT7("LoSlot7"),

        LOCKED("Locked"),

        MEDSLOT0("MedSlot0"),

        MEDSLOT1("MedSlot1"),

        MEDSLOT2("MedSlot2"),

        MEDSLOT3("MedSlot3"),

        MEDSLOT4("MedSlot4"),

        MEDSLOT5("MedSlot5"),

        MEDSLOT6("MedSlot6"),

        MEDSLOT7("MedSlot7"),

        MODULE("Module"),

        QUAFEBAY("QuafeBay"),

        RIGSLOT0("RigSlot0"),

        RIGSLOT1("RigSlot1"),

        RIGSLOT2("RigSlot2"),

        RIGSLOT3("RigSlot3"),

        RIGSLOT4("RigSlot4"),

        RIGSLOT5("RigSlot5"),

        RIGSLOT6("RigSlot6"),

        RIGSLOT7("RigSlot7"),

        SHIPHANGAR("ShipHangar"),

        SPECIALIZEDAMMOHOLD("SpecializedAmmoHold"),

        SPECIALIZEDCOMMANDCENTERHOLD("SpecializedCommandCenterHold"),

        SPECIALIZEDFUELBAY("SpecializedFuelBay"),

        SPECIALIZEDGASHOLD("SpecializedGasHold"),

        SPECIALIZEDINDUSTRIALSHIPHOLD("SpecializedIndustrialShipHold"),

        SPECIALIZEDLARGESHIPHOLD("SpecializedLargeShipHold"),

        SPECIALIZEDMATERIALBAY("SpecializedMaterialBay"),

        SPECIALIZEDMEDIUMSHIPHOLD("SpecializedMediumShipHold"),

        SPECIALIZEDMINERALHOLD("SpecializedMineralHold"),

        SPECIALIZEDOREHOLD("SpecializedOreHold"),

        SPECIALIZEDPLANETARYCOMMODITIESHOLD("SpecializedPlanetaryCommoditiesHold"),

        SPECIALIZEDSALVAGEHOLD("SpecializedSalvageHold"),

        SPECIALIZEDSHIPHOLD("SpecializedShipHold"),

        SPECIALIZEDSMALLSHIPHOLD("SpecializedSmallShipHold"),

        SUBSYSTEMBAY("SubSystemBay"),

        SUBSYSTEMSLOT0("SubSystemSlot0"),

        SUBSYSTEMSLOT1("SubSystemSlot1"),

        SUBSYSTEMSLOT2("SubSystemSlot2"),

        SUBSYSTEMSLOT3("SubSystemSlot3"),

        SUBSYSTEMSLOT4("SubSystemSlot4"),

        SUBSYSTEMSLOT5("SubSystemSlot5"),

        SUBSYSTEMSLOT6("SubSystemSlot6"),

        SUBSYSTEMSLOT7("SubSystemSlot7"),

        UNLOCKED("Unlocked"),

        WARDROBE("Wardrobe");

        private String value;

        LocationFlagEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationFlagEnum fromValue(String text) {
            for (LocationFlagEnum b : LocationFlagEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("location_flag")
    private LocationFlagEnum locationFlag = null;

    @JsonProperty("location_id")
    private Long locationId = null;

    /**
     * location_type string
     */
    public enum LocationTypeEnum {
        STATION("station"),

        SOLAR_SYSTEM("solar_system"),

        OTHER("other");

        private String value;

        LocationTypeEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static LocationTypeEnum fromValue(String text) {
            for (LocationTypeEnum b : LocationTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("location_type")
    private LocationTypeEnum locationType = null;

    @JsonProperty("quantity")
    private Integer quantity = null;

    @JsonProperty("type_id")
    private Integer typeId = null;

    public CharacterAssetsResponse isSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
        return this;
    }

    /**
     * is_singleton boolean
     * 
     * @return isSingleton
     **/
    @ApiModelProperty(example = "null", required = true, value = "is_singleton boolean")
    public Boolean getIsSingleton() {
        return isSingleton;
    }

    public void setIsSingleton(Boolean isSingleton) {
        this.isSingleton = isSingleton;
    }

    public CharacterAssetsResponse itemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    /**
     * item_id integer
     * 
     * @return itemId
     **/
    @ApiModelProperty(example = "null", required = true, value = "item_id integer")
    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public CharacterAssetsResponse locationFlag(LocationFlagEnum locationFlag) {
        this.locationFlag = locationFlag;
        return this;
    }

    /**
     * location_flag string
     * 
     * @return locationFlag
     **/
    @ApiModelProperty(example = "null", required = true, value = "location_flag string")
    public LocationFlagEnum getLocationFlag() {
        return locationFlag;
    }

    public void setLocationFlag(LocationFlagEnum locationFlag) {
        this.locationFlag = locationFlag;
    }

    public CharacterAssetsResponse locationId(Long locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * location_id integer
     * 
     * @return locationId
     **/
    @ApiModelProperty(example = "null", required = true, value = "location_id integer")
    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    public CharacterAssetsResponse locationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * location_type string
     * 
     * @return locationType
     **/
    @ApiModelProperty(example = "null", required = true, value = "location_type string")
    public LocationTypeEnum getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationTypeEnum locationType) {
        this.locationType = locationType;
    }

    public CharacterAssetsResponse quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * quantity integer
     * 
     * @return quantity
     **/
    @ApiModelProperty(example = "null", value = "quantity integer")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CharacterAssetsResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(example = "null", required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterAssetsResponse characterAssetsResponse = (CharacterAssetsResponse) o;
        return Objects.equals(this.isSingleton, characterAssetsResponse.isSingleton)
                && Objects.equals(this.itemId, characterAssetsResponse.itemId)
                && Objects.equals(this.locationFlag, characterAssetsResponse.locationFlag)
                && Objects.equals(this.locationId, characterAssetsResponse.locationId)
                && Objects.equals(this.locationType, characterAssetsResponse.locationType)
                && Objects.equals(this.quantity, characterAssetsResponse.quantity)
                && Objects.equals(this.typeId, characterAssetsResponse.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSingleton, itemId, locationFlag, locationId, locationType, quantity, typeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterAssetsResponse {\n");

        sb.append("    isSingleton: ").append(toIndentedString(isSingleton)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    locationFlag: ").append(toIndentedString(locationFlag)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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
