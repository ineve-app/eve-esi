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
import net.troja.eve.esi.model.KillmailSubItem;
import java.io.Serializable;

/**
 * item object
 */
@ApiModel(description = "item object")
public class KillmailItem implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_QUANTITY_DESTROYED = "quantity_destroyed";
    @SerializedName(SERIALIZED_NAME_QUANTITY_DESTROYED)
    private Long quantityDestroyed;

    public static final String SERIALIZED_NAME_SINGLETON = "singleton";
    @SerializedName(SERIALIZED_NAME_SINGLETON)
    private Integer singleton;

    public static final String SERIALIZED_NAME_FLAG = "flag";
    @SerializedName(SERIALIZED_NAME_FLAG)
    private Integer flag;

    public static final String SERIALIZED_NAME_ITEM_TYPE_ID = "item_type_id";
    @SerializedName(SERIALIZED_NAME_ITEM_TYPE_ID)
    private Integer itemTypeId;

    public static final String SERIALIZED_NAME_QUANTITY_DROPPED = "quantity_dropped";
    @SerializedName(SERIALIZED_NAME_QUANTITY_DROPPED)
    private Long quantityDropped;

    public static final String SERIALIZED_NAME_ITEMS = "items";
    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<KillmailSubItem> items = null;

    public KillmailItem quantityDestroyed(Long quantityDestroyed) {
        this.quantityDestroyed = quantityDestroyed;
        return this;
    }

    /**
     * How many of the item were destroyed if any
     * 
     * @return quantityDestroyed
     **/
    @ApiModelProperty(value = "How many of the item were destroyed if any ")
    public Long getQuantityDestroyed() {
        return quantityDestroyed;
    }

    public void setQuantityDestroyed(Long quantityDestroyed) {
        this.quantityDestroyed = quantityDestroyed;
    }

    public KillmailItem singleton(Integer singleton) {
        this.singleton = singleton;
        return this;
    }

    /**
     * singleton integer
     * 
     * @return singleton
     **/
    @ApiModelProperty(required = true, value = "singleton integer")
    public Integer getSingleton() {
        return singleton;
    }

    public void setSingleton(Integer singleton) {
        this.singleton = singleton;
    }

    public KillmailItem flag(Integer flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Flag for the location of the item
     * 
     * @return flag
     **/
    @ApiModelProperty(required = true, value = "Flag for the location of the item ")
    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public KillmailItem itemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
        return this;
    }

    /**
     * item_type_id integer
     * 
     * @return itemTypeId
     **/
    @ApiModelProperty(required = true, value = "item_type_id integer")
    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public KillmailItem quantityDropped(Long quantityDropped) {
        this.quantityDropped = quantityDropped;
        return this;
    }

    /**
     * How many of the item were dropped if any
     * 
     * @return quantityDropped
     **/
    @ApiModelProperty(value = "How many of the item were dropped if any ")
    public Long getQuantityDropped() {
        return quantityDropped;
    }

    public void setQuantityDropped(Long quantityDropped) {
        this.quantityDropped = quantityDropped;
    }

    public KillmailItem items(List<KillmailSubItem> items) {
        this.items = items;
        return this;
    }

    public KillmailItem addItemsItem(KillmailSubItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * items array
     * 
     * @return items
     **/
    @ApiModelProperty(value = "items array")
    public List<KillmailSubItem> getItems() {
        return items;
    }

    public void setItems(List<KillmailSubItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KillmailItem killmailItem = (KillmailItem) o;
        return Objects.equals(this.quantityDestroyed, killmailItem.quantityDestroyed)
                && Objects.equals(this.singleton, killmailItem.singleton)
                && Objects.equals(this.flag, killmailItem.flag)
                && Objects.equals(this.itemTypeId, killmailItem.itemTypeId)
                && Objects.equals(this.quantityDropped, killmailItem.quantityDropped)
                && Objects.equals(this.items, killmailItem.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantityDestroyed, singleton, flag, itemTypeId, quantityDropped, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillmailItem {\n");

        sb.append("    quantityDestroyed: ").append(toIndentedString(quantityDestroyed)).append("\n");
        sb.append("    singleton: ").append(toIndentedString(singleton)).append("\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    itemTypeId: ").append(toIndentedString(itemTypeId)).append("\n");
        sb.append("    quantityDropped: ").append(toIndentedString(quantityDropped)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
