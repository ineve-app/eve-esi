/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.3.8
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
 * mining object
 */
@ApiModel(description = "mining object")
public class CharacterStatsMining implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_DRONE_MINE = "drone_mine";
    @SerializedName(SERIALIZED_NAME_DRONE_MINE)
    private Long droneMine;

    public static final String SERIALIZED_NAME_ORE_ARKONOR = "ore_arkonor";
    @SerializedName(SERIALIZED_NAME_ORE_ARKONOR)
    private Long oreArkonor;

    public static final String SERIALIZED_NAME_ORE_BISTOT = "ore_bistot";
    @SerializedName(SERIALIZED_NAME_ORE_BISTOT)
    private Long oreBistot;

    public static final String SERIALIZED_NAME_ORE_CROKITE = "ore_crokite";
    @SerializedName(SERIALIZED_NAME_ORE_CROKITE)
    private Long oreCrokite;

    public static final String SERIALIZED_NAME_ORE_DARK_OCHRE = "ore_dark_ochre";
    @SerializedName(SERIALIZED_NAME_ORE_DARK_OCHRE)
    private Long oreDarkOchre;

    public static final String SERIALIZED_NAME_ORE_GNEISS = "ore_gneiss";
    @SerializedName(SERIALIZED_NAME_ORE_GNEISS)
    private Long oreGneiss;

    public static final String SERIALIZED_NAME_ORE_HARVESTABLE_CLOUD = "ore_harvestable_cloud";
    @SerializedName(SERIALIZED_NAME_ORE_HARVESTABLE_CLOUD)
    private Long oreHarvestableCloud;

    public static final String SERIALIZED_NAME_ORE_HEDBERGITE = "ore_hedbergite";
    @SerializedName(SERIALIZED_NAME_ORE_HEDBERGITE)
    private Long oreHedbergite;

    public static final String SERIALIZED_NAME_ORE_HEMORPHITE = "ore_hemorphite";
    @SerializedName(SERIALIZED_NAME_ORE_HEMORPHITE)
    private Long oreHemorphite;

    public static final String SERIALIZED_NAME_ORE_ICE = "ore_ice";
    @SerializedName(SERIALIZED_NAME_ORE_ICE)
    private Long oreIce;

    public static final String SERIALIZED_NAME_ORE_JASPET = "ore_jaspet";
    @SerializedName(SERIALIZED_NAME_ORE_JASPET)
    private Long oreJaspet;

    public static final String SERIALIZED_NAME_ORE_KERNITE = "ore_kernite";
    @SerializedName(SERIALIZED_NAME_ORE_KERNITE)
    private Long oreKernite;

    public static final String SERIALIZED_NAME_ORE_MERCOXIT = "ore_mercoxit";
    @SerializedName(SERIALIZED_NAME_ORE_MERCOXIT)
    private Long oreMercoxit;

    public static final String SERIALIZED_NAME_ORE_OMBER = "ore_omber";
    @SerializedName(SERIALIZED_NAME_ORE_OMBER)
    private Long oreOmber;

    public static final String SERIALIZED_NAME_ORE_PLAGIOCLASE = "ore_plagioclase";
    @SerializedName(SERIALIZED_NAME_ORE_PLAGIOCLASE)
    private Long orePlagioclase;

    public static final String SERIALIZED_NAME_ORE_PYROXERES = "ore_pyroxeres";
    @SerializedName(SERIALIZED_NAME_ORE_PYROXERES)
    private Long orePyroxeres;

    public static final String SERIALIZED_NAME_ORE_SCORDITE = "ore_scordite";
    @SerializedName(SERIALIZED_NAME_ORE_SCORDITE)
    private Long oreScordite;

    public static final String SERIALIZED_NAME_ORE_SPODUMAIN = "ore_spodumain";
    @SerializedName(SERIALIZED_NAME_ORE_SPODUMAIN)
    private Long oreSpodumain;

    public static final String SERIALIZED_NAME_ORE_VELDSPAR = "ore_veldspar";
    @SerializedName(SERIALIZED_NAME_ORE_VELDSPAR)
    private Long oreVeldspar;

    public CharacterStatsMining droneMine(Long droneMine) {

        this.droneMine = droneMine;
        return this;
    }

    /**
     * drone_mine integer
     * 
     * @return droneMine
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "drone_mine integer")
    public Long getDroneMine() {
        return droneMine;
    }

    public void setDroneMine(Long droneMine) {
        this.droneMine = droneMine;
    }

    public CharacterStatsMining oreArkonor(Long oreArkonor) {

        this.oreArkonor = oreArkonor;
        return this;
    }

    /**
     * ore_arkonor integer
     * 
     * @return oreArkonor
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_arkonor integer")
    public Long getOreArkonor() {
        return oreArkonor;
    }

    public void setOreArkonor(Long oreArkonor) {
        this.oreArkonor = oreArkonor;
    }

    public CharacterStatsMining oreBistot(Long oreBistot) {

        this.oreBistot = oreBistot;
        return this;
    }

    /**
     * ore_bistot integer
     * 
     * @return oreBistot
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_bistot integer")
    public Long getOreBistot() {
        return oreBistot;
    }

    public void setOreBistot(Long oreBistot) {
        this.oreBistot = oreBistot;
    }

    public CharacterStatsMining oreCrokite(Long oreCrokite) {

        this.oreCrokite = oreCrokite;
        return this;
    }

    /**
     * ore_crokite integer
     * 
     * @return oreCrokite
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_crokite integer")
    public Long getOreCrokite() {
        return oreCrokite;
    }

    public void setOreCrokite(Long oreCrokite) {
        this.oreCrokite = oreCrokite;
    }

    public CharacterStatsMining oreDarkOchre(Long oreDarkOchre) {

        this.oreDarkOchre = oreDarkOchre;
        return this;
    }

    /**
     * ore_dark_ochre integer
     * 
     * @return oreDarkOchre
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_dark_ochre integer")
    public Long getOreDarkOchre() {
        return oreDarkOchre;
    }

    public void setOreDarkOchre(Long oreDarkOchre) {
        this.oreDarkOchre = oreDarkOchre;
    }

    public CharacterStatsMining oreGneiss(Long oreGneiss) {

        this.oreGneiss = oreGneiss;
        return this;
    }

    /**
     * ore_gneiss integer
     * 
     * @return oreGneiss
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_gneiss integer")
    public Long getOreGneiss() {
        return oreGneiss;
    }

    public void setOreGneiss(Long oreGneiss) {
        this.oreGneiss = oreGneiss;
    }

    public CharacterStatsMining oreHarvestableCloud(Long oreHarvestableCloud) {

        this.oreHarvestableCloud = oreHarvestableCloud;
        return this;
    }

    /**
     * ore_harvestable_cloud integer
     * 
     * @return oreHarvestableCloud
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_harvestable_cloud integer")
    public Long getOreHarvestableCloud() {
        return oreHarvestableCloud;
    }

    public void setOreHarvestableCloud(Long oreHarvestableCloud) {
        this.oreHarvestableCloud = oreHarvestableCloud;
    }

    public CharacterStatsMining oreHedbergite(Long oreHedbergite) {

        this.oreHedbergite = oreHedbergite;
        return this;
    }

    /**
     * ore_hedbergite integer
     * 
     * @return oreHedbergite
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_hedbergite integer")
    public Long getOreHedbergite() {
        return oreHedbergite;
    }

    public void setOreHedbergite(Long oreHedbergite) {
        this.oreHedbergite = oreHedbergite;
    }

    public CharacterStatsMining oreHemorphite(Long oreHemorphite) {

        this.oreHemorphite = oreHemorphite;
        return this;
    }

    /**
     * ore_hemorphite integer
     * 
     * @return oreHemorphite
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_hemorphite integer")
    public Long getOreHemorphite() {
        return oreHemorphite;
    }

    public void setOreHemorphite(Long oreHemorphite) {
        this.oreHemorphite = oreHemorphite;
    }

    public CharacterStatsMining oreIce(Long oreIce) {

        this.oreIce = oreIce;
        return this;
    }

    /**
     * ore_ice integer
     * 
     * @return oreIce
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_ice integer")
    public Long getOreIce() {
        return oreIce;
    }

    public void setOreIce(Long oreIce) {
        this.oreIce = oreIce;
    }

    public CharacterStatsMining oreJaspet(Long oreJaspet) {

        this.oreJaspet = oreJaspet;
        return this;
    }

    /**
     * ore_jaspet integer
     * 
     * @return oreJaspet
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_jaspet integer")
    public Long getOreJaspet() {
        return oreJaspet;
    }

    public void setOreJaspet(Long oreJaspet) {
        this.oreJaspet = oreJaspet;
    }

    public CharacterStatsMining oreKernite(Long oreKernite) {

        this.oreKernite = oreKernite;
        return this;
    }

    /**
     * ore_kernite integer
     * 
     * @return oreKernite
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_kernite integer")
    public Long getOreKernite() {
        return oreKernite;
    }

    public void setOreKernite(Long oreKernite) {
        this.oreKernite = oreKernite;
    }

    public CharacterStatsMining oreMercoxit(Long oreMercoxit) {

        this.oreMercoxit = oreMercoxit;
        return this;
    }

    /**
     * ore_mercoxit integer
     * 
     * @return oreMercoxit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_mercoxit integer")
    public Long getOreMercoxit() {
        return oreMercoxit;
    }

    public void setOreMercoxit(Long oreMercoxit) {
        this.oreMercoxit = oreMercoxit;
    }

    public CharacterStatsMining oreOmber(Long oreOmber) {

        this.oreOmber = oreOmber;
        return this;
    }

    /**
     * ore_omber integer
     * 
     * @return oreOmber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_omber integer")
    public Long getOreOmber() {
        return oreOmber;
    }

    public void setOreOmber(Long oreOmber) {
        this.oreOmber = oreOmber;
    }

    public CharacterStatsMining orePlagioclase(Long orePlagioclase) {

        this.orePlagioclase = orePlagioclase;
        return this;
    }

    /**
     * ore_plagioclase integer
     * 
     * @return orePlagioclase
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_plagioclase integer")
    public Long getOrePlagioclase() {
        return orePlagioclase;
    }

    public void setOrePlagioclase(Long orePlagioclase) {
        this.orePlagioclase = orePlagioclase;
    }

    public CharacterStatsMining orePyroxeres(Long orePyroxeres) {

        this.orePyroxeres = orePyroxeres;
        return this;
    }

    /**
     * ore_pyroxeres integer
     * 
     * @return orePyroxeres
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_pyroxeres integer")
    public Long getOrePyroxeres() {
        return orePyroxeres;
    }

    public void setOrePyroxeres(Long orePyroxeres) {
        this.orePyroxeres = orePyroxeres;
    }

    public CharacterStatsMining oreScordite(Long oreScordite) {

        this.oreScordite = oreScordite;
        return this;
    }

    /**
     * ore_scordite integer
     * 
     * @return oreScordite
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_scordite integer")
    public Long getOreScordite() {
        return oreScordite;
    }

    public void setOreScordite(Long oreScordite) {
        this.oreScordite = oreScordite;
    }

    public CharacterStatsMining oreSpodumain(Long oreSpodumain) {

        this.oreSpodumain = oreSpodumain;
        return this;
    }

    /**
     * ore_spodumain integer
     * 
     * @return oreSpodumain
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_spodumain integer")
    public Long getOreSpodumain() {
        return oreSpodumain;
    }

    public void setOreSpodumain(Long oreSpodumain) {
        this.oreSpodumain = oreSpodumain;
    }

    public CharacterStatsMining oreVeldspar(Long oreVeldspar) {

        this.oreVeldspar = oreVeldspar;
        return this;
    }

    /**
     * ore_veldspar integer
     * 
     * @return oreVeldspar
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ore_veldspar integer")
    public Long getOreVeldspar() {
        return oreVeldspar;
    }

    public void setOreVeldspar(Long oreVeldspar) {
        this.oreVeldspar = oreVeldspar;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterStatsMining characterStatsMining = (CharacterStatsMining) o;
        return Objects.equals(this.droneMine, characterStatsMining.droneMine)
                && Objects.equals(this.oreArkonor, characterStatsMining.oreArkonor)
                && Objects.equals(this.oreBistot, characterStatsMining.oreBistot)
                && Objects.equals(this.oreCrokite, characterStatsMining.oreCrokite)
                && Objects.equals(this.oreDarkOchre, characterStatsMining.oreDarkOchre)
                && Objects.equals(this.oreGneiss, characterStatsMining.oreGneiss)
                && Objects.equals(this.oreHarvestableCloud, characterStatsMining.oreHarvestableCloud)
                && Objects.equals(this.oreHedbergite, characterStatsMining.oreHedbergite)
                && Objects.equals(this.oreHemorphite, characterStatsMining.oreHemorphite)
                && Objects.equals(this.oreIce, characterStatsMining.oreIce)
                && Objects.equals(this.oreJaspet, characterStatsMining.oreJaspet)
                && Objects.equals(this.oreKernite, characterStatsMining.oreKernite)
                && Objects.equals(this.oreMercoxit, characterStatsMining.oreMercoxit)
                && Objects.equals(this.oreOmber, characterStatsMining.oreOmber)
                && Objects.equals(this.orePlagioclase, characterStatsMining.orePlagioclase)
                && Objects.equals(this.orePyroxeres, characterStatsMining.orePyroxeres)
                && Objects.equals(this.oreScordite, characterStatsMining.oreScordite)
                && Objects.equals(this.oreSpodumain, characterStatsMining.oreSpodumain)
                && Objects.equals(this.oreVeldspar, characterStatsMining.oreVeldspar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(droneMine, oreArkonor, oreBistot, oreCrokite, oreDarkOchre, oreGneiss, oreHarvestableCloud,
                oreHedbergite, oreHemorphite, oreIce, oreJaspet, oreKernite, oreMercoxit, oreOmber, orePlagioclase,
                orePyroxeres, oreScordite, oreSpodumain, oreVeldspar);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterStatsMining {\n");
        sb.append("    droneMine: ").append(toIndentedString(droneMine)).append("\n");
        sb.append("    oreArkonor: ").append(toIndentedString(oreArkonor)).append("\n");
        sb.append("    oreBistot: ").append(toIndentedString(oreBistot)).append("\n");
        sb.append("    oreCrokite: ").append(toIndentedString(oreCrokite)).append("\n");
        sb.append("    oreDarkOchre: ").append(toIndentedString(oreDarkOchre)).append("\n");
        sb.append("    oreGneiss: ").append(toIndentedString(oreGneiss)).append("\n");
        sb.append("    oreHarvestableCloud: ").append(toIndentedString(oreHarvestableCloud)).append("\n");
        sb.append("    oreHedbergite: ").append(toIndentedString(oreHedbergite)).append("\n");
        sb.append("    oreHemorphite: ").append(toIndentedString(oreHemorphite)).append("\n");
        sb.append("    oreIce: ").append(toIndentedString(oreIce)).append("\n");
        sb.append("    oreJaspet: ").append(toIndentedString(oreJaspet)).append("\n");
        sb.append("    oreKernite: ").append(toIndentedString(oreKernite)).append("\n");
        sb.append("    oreMercoxit: ").append(toIndentedString(oreMercoxit)).append("\n");
        sb.append("    oreOmber: ").append(toIndentedString(oreOmber)).append("\n");
        sb.append("    orePlagioclase: ").append(toIndentedString(orePlagioclase)).append("\n");
        sb.append("    orePyroxeres: ").append(toIndentedString(orePyroxeres)).append("\n");
        sb.append("    oreScordite: ").append(toIndentedString(oreScordite)).append("\n");
        sb.append("    oreSpodumain: ").append(toIndentedString(oreSpodumain)).append("\n");
        sb.append("    oreVeldspar: ").append(toIndentedString(oreVeldspar)).append("\n");
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
