/**
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * OpenAPI spec version: 0.2.7.dev1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
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
public class WarKillmailsResponse implements Serializable {
    @JsonProperty("killmail_hash")
    private String killmailHash = null;

    @JsonProperty("killmail_id")
    private Integer killmailId = null;

    public WarKillmailsResponse killmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
        return this;
    }

    /**
     * A hash of this killmail
     * 
     * @return killmailHash
     **/
    @ApiModelProperty(example = "null", required = true, value = "A hash of this killmail")
    public String getKillmailHash() {
        return killmailHash;
    }

    public void setKillmailHash(String killmailHash) {
        this.killmailHash = killmailHash;
    }

    public WarKillmailsResponse killmailId(Integer killmailId) {
        this.killmailId = killmailId;
        return this;
    }

    /**
     * ID of this killmail
     * 
     * @return killmailId
     **/
    @ApiModelProperty(example = "null", required = true, value = "ID of this killmail")
    public Integer getKillmailId() {
        return killmailId;
    }

    public void setKillmailId(Integer killmailId) {
        this.killmailId = killmailId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WarKillmailsResponse warKillmailsResponse = (WarKillmailsResponse) o;
        return Objects.equals(this.killmailHash, warKillmailsResponse.killmailHash)
                && Objects.equals(this.killmailId, warKillmailsResponse.killmailId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(killmailHash, killmailId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarKillmailsResponse {\n");

        sb.append("    killmailHash: ").append(toIndentedString(killmailHash)).append("\n");
        sb.append("    killmailId: ").append(toIndentedString(killmailId)).append("\n");
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