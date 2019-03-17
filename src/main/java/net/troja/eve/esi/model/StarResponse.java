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
public class StarResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_TYPE_ID = "type_id";
    @SerializedName(SERIALIZED_NAME_TYPE_ID)
    private Integer typeId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TEMPERATURE = "temperature";
    @SerializedName(SERIALIZED_NAME_TEMPERATURE)
    private Integer temperature;

    public static final String SERIALIZED_NAME_LUMINOSITY = "luminosity";
    @SerializedName(SERIALIZED_NAME_LUMINOSITY)
    private Float luminosity;

    public static final String SERIALIZED_NAME_SOLAR_SYSTEM_ID = "solar_system_id";
    @SerializedName(SERIALIZED_NAME_SOLAR_SYSTEM_ID)
    private Integer solarSystemId;

    public static final String SERIALIZED_NAME_RADIUS = "radius";
    @SerializedName(SERIALIZED_NAME_RADIUS)
    private Long radius;

    /**
     * spectral_class string
     */
    @JsonAdapter(SpectralClassEnum.Adapter.class)
    public enum SpectralClassEnum {
        K2_V("K2 V"),

        K4_V("K4 V"),

        G2_V("G2 V"),

        G8_V("G8 V"),

        M7_V("M7 V"),

        K7_V("K7 V"),

        M2_V("M2 V"),

        K5_V("K5 V"),

        M3_V("M3 V"),

        G0_V("G0 V"),

        G7_V("G7 V"),

        G3_V("G3 V"),

        F9_V("F9 V"),

        G5_V("G5 V"),

        F6_V("F6 V"),

        K8_V("K8 V"),

        K9_V("K9 V"),

        K6_V("K6 V"),

        G9_V("G9 V"),

        G6_V("G6 V"),

        G4_VI("G4 VI"),

        G4_V("G4 V"),

        F8_V("F8 V"),

        F2_V("F2 V"),

        F1_V("F1 V"),

        K3_V("K3 V"),

        F0_VI("F0 VI"),

        G1_VI("G1 VI"),

        G0_VI("G0 VI"),

        K1_V("K1 V"),

        M4_V("M4 V"),

        M1_V("M1 V"),

        M6_V("M6 V"),

        M0_V("M0 V"),

        K2_IV("K2 IV"),

        G2_VI("G2 VI"),

        K0_V("K0 V"),

        K5_IV("K5 IV"),

        F5_VI("F5 VI"),

        G6_VI("G6 VI"),

        F6_VI("F6 VI"),

        F2_IV("F2 IV"),

        G3_VI("G3 VI"),

        M8_V("M8 V"),

        F1_VI("F1 VI"),

        K1_IV("K1 IV"),

        F7_V("F7 V"),

        G5_VI("G5 VI"),

        M5_V("M5 V"),

        G7_VI("G7 VI"),

        F5_V("F5 V"),

        F4_VI("F4 VI"),

        F8_VI("F8 VI"),

        K3_IV("K3 IV"),

        F4_IV("F4 IV"),

        F0_V("F0 V"),

        G7_IV("G7 IV"),

        G8_VI("G8 VI"),

        F2_VI("F2 VI"),

        F4_V("F4 V"),

        F7_VI("F7 VI"),

        F3_V("F3 V"),

        G1_V("G1 V"),

        G9_VI("G9 VI"),

        F3_IV("F3 IV"),

        F9_VI("F9 VI"),

        M9_V("M9 V"),

        K0_IV("K0 IV"),

        F1_IV("F1 IV"),

        G4_IV("G4 IV"),

        F3_VI("F3 VI"),

        K4_IV("K4 IV"),

        G5_IV("G5 IV"),

        G3_IV("G3 IV"),

        G1_IV("G1 IV"),

        K7_IV("K7 IV"),

        G0_IV("G0 IV"),

        K6_IV("K6 IV"),

        K9_IV("K9 IV"),

        G2_IV("G2 IV"),

        F9_IV("F9 IV"),

        F0_IV("F0 IV"),

        K8_IV("K8 IV"),

        G8_IV("G8 IV"),

        F6_IV("F6 IV"),

        F5_IV("F5 IV"),

        A0("A0"),

        A0IV("A0IV"),

        A0IV2("A0IV2");

        private String value;

        SpectralClassEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SpectralClassEnum fromValue(String text) {
            for (SpectralClassEnum b : SpectralClassEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }

        public static class Adapter extends TypeAdapter<SpectralClassEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final SpectralClassEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SpectralClassEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SpectralClassEnum.fromValue(String.valueOf(value));
            }
        }
    }

    public static final String SERIALIZED_NAME_SPECTRAL_CLASS = "spectral_class";
    @SerializedName(SERIALIZED_NAME_SPECTRAL_CLASS)
    private SpectralClassEnum spectralClass;

    public static final String SERIALIZED_NAME_AGE = "age";
    @SerializedName(SERIALIZED_NAME_AGE)
    private Long age;

    public StarResponse typeId(Integer typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     * type_id integer
     * 
     * @return typeId
     **/
    @ApiModelProperty(required = true, value = "type_id integer")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public StarResponse name(String name) {
        this.name = name;
        return this;
    }

    /**
     * name string
     * 
     * @return name
     **/
    @ApiModelProperty(required = true, value = "name string")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarResponse temperature(Integer temperature) {
        this.temperature = temperature;
        return this;
    }

    /**
     * temperature integer
     * 
     * @return temperature
     **/
    @ApiModelProperty(required = true, value = "temperature integer")
    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public StarResponse luminosity(Float luminosity) {
        this.luminosity = luminosity;
        return this;
    }

    /**
     * luminosity number
     * 
     * @return luminosity
     **/
    @ApiModelProperty(required = true, value = "luminosity number")
    public Float getLuminosity() {
        return luminosity;
    }

    public void setLuminosity(Float luminosity) {
        this.luminosity = luminosity;
    }

    public StarResponse solarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
        return this;
    }

    /**
     * solar_system_id integer
     * 
     * @return solarSystemId
     **/
    @ApiModelProperty(required = true, value = "solar_system_id integer")
    public Integer getSolarSystemId() {
        return solarSystemId;
    }

    public void setSolarSystemId(Integer solarSystemId) {
        this.solarSystemId = solarSystemId;
    }

    public StarResponse radius(Long radius) {
        this.radius = radius;
        return this;
    }

    /**
     * radius integer
     * 
     * @return radius
     **/
    @ApiModelProperty(required = true, value = "radius integer")
    public Long getRadius() {
        return radius;
    }

    public void setRadius(Long radius) {
        this.radius = radius;
    }

    public StarResponse spectralClass(SpectralClassEnum spectralClass) {
        this.spectralClass = spectralClass;
        return this;
    }

    /**
     * spectral_class string
     * 
     * @return spectralClass
     **/
    @ApiModelProperty(required = true, value = "spectral_class string")
    public SpectralClassEnum getSpectralClass() {
        return spectralClass;
    }

    public void setSpectralClass(SpectralClassEnum spectralClass) {
        this.spectralClass = spectralClass;
    }

    public StarResponse age(Long age) {
        this.age = age;
        return this;
    }

    /**
     * Age of star in years
     * 
     * @return age
     **/
    @ApiModelProperty(required = true, value = "Age of star in years")
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StarResponse starResponse = (StarResponse) o;
        return Objects.equals(this.typeId, starResponse.typeId) && Objects.equals(this.name, starResponse.name)
                && Objects.equals(this.temperature, starResponse.temperature)
                && Objects.equals(this.luminosity, starResponse.luminosity)
                && Objects.equals(this.solarSystemId, starResponse.solarSystemId)
                && Objects.equals(this.radius, starResponse.radius)
                && Objects.equals(this.spectralClass, starResponse.spectralClass)
                && Objects.equals(this.age, starResponse.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, name, temperature, luminosity, solarSystemId, radius, spectralClass, age);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarResponse {\n");

        sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    temperature: ").append(toIndentedString(temperature)).append("\n");
        sb.append("    luminosity: ").append(toIndentedString(luminosity)).append("\n");
        sb.append("    solarSystemId: ").append(toIndentedString(solarSystemId)).append("\n");
        sb.append("    radius: ").append(toIndentedString(radius)).append("\n");
        sb.append("    spectralClass: ").append(toIndentedString(spectralClass)).append("\n");
        sb.append("    age: ").append(toIndentedString(age)).append("\n");
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
