package com.salesmore.yak.integration.shopee.model.item.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.salesmore.yak.integration.shopee.model.IIdRequestBase;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ItemPrice implements IIdRequestBase {


    public static final long serialVersionUID = 1L;

    /**
     * Unique identifier for an item.
     */
    @JsonProperty("item_id")
    private Long id;

    /**
     * Specify the revised price of the item.
     */
    private float price;

    /**
     * partner Id field that must be included in all request body
     * This is the assigned to partner upon registration
     */
    @JsonProperty("partner_id")
    private long partnerId;

    /**
     * shopid field that must be included in all request body
     * One partner might have multiple associated shopids, please use the correct shopid.
     */
    @JsonProperty("shopid")
    private long shopId;

    /**
     * timestamp field that must be included in all request body
     *
     * Please put the current UNIX timestamp when making a request
     */
    private long timestamp;
}
