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
public class CorporationAlliancesHistoryResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private Integer recordId;

    public static final String SERIALIZED_NAME_ALLIANCE_ID = "alliance_id";
    @SerializedName(SERIALIZED_NAME_ALLIANCE_ID)
    private Integer allianceId;

    public static final String SERIALIZED_NAME_IS_DELETED = "is_deleted";
    @SerializedName(SERIALIZED_NAME_IS_DELETED)
    private Boolean isDeleted;

    public static final String SERIALIZED_NAME_START_DATE = "start_date";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private OffsetDateTime startDate;

    public CorporationAlliancesHistoryResponse recordId(Integer recordId) {
        this.recordId = recordId;
        return this;
    }

    /**
     * An incrementing ID that can be used to canonically establish order of
     * records in cases where dates may be ambiguous
     * 
     * @return recordId
     **/
    @ApiModelProperty(required = true, value = "An incrementing ID that can be used to canonically establish order of records in cases where dates may be ambiguous")
    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public CorporationAlliancesHistoryResponse allianceId(Integer allianceId) {
        this.allianceId = allianceId;
        return this;
    }

    /**
     * alliance_id integer
     * 
     * @return allianceId
     **/
    @ApiModelProperty(value = "alliance_id integer")
    public Integer getAllianceId() {
        return allianceId;
    }

    public void setAllianceId(Integer allianceId) {
        this.allianceId = allianceId;
    }

    public CorporationAlliancesHistoryResponse isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    /**
     * True if the alliance has been closed
     * 
     * @return isDeleted
     **/
    @ApiModelProperty(value = "True if the alliance has been closed")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public CorporationAlliancesHistoryResponse startDate(OffsetDateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * start_date string
     * 
     * @return startDate
     **/
    @ApiModelProperty(required = true, value = "start_date string")
    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorporationAlliancesHistoryResponse corporationAlliancesHistoryResponse = (CorporationAlliancesHistoryResponse) o;
        return Objects.equals(this.recordId, corporationAlliancesHistoryResponse.recordId)
                && Objects.equals(this.allianceId, corporationAlliancesHistoryResponse.allianceId)
                && Objects.equals(this.isDeleted, corporationAlliancesHistoryResponse.isDeleted)
                && Objects.equals(this.startDate, corporationAlliancesHistoryResponse.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, allianceId, isDeleted, startDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorporationAlliancesHistoryResponse {\n");

        sb.append("    recordId: ").append(toIndentedString(recordId)).append("\n");
        sb.append("    allianceId: ").append(toIndentedString(allianceId)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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
