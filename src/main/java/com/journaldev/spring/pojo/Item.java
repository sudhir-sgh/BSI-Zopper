
package com.journaldev.spring.pojo;

import javax.annotation.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "comment",
    "order_summary__comment",
    "bundled_warranty__duration",
    "item_online_amount",
    "store_id",
    "is_retailer_cancelled",
    "order_item_discount",
    "item_meta__seller_diverted_by_time",
    "item_meta__edit_delivery_mode_by",
    "shipment__delivery_timestamp",
    "order_summary__lng",
    "item_meta__seller_diverted_by",
    "coupon_discount",
    "shipping_charges",
    "item_meta__ofd_by",
    "retailer_acceptance_time",
    "item_meta__cancellation_done_by",
    "item_meta__shipment_gen_by",
    "order_item_total",
    "exchange_discount",
    "id",
    "cancel_reason",
    "has_warranty",
    "is_exchange_applied",
    "shipment__shipment_status",
    "order_summary__cod_amount",
    "shipment__delivery_partner__name",
    "cancellation_reason",
    "unit_price",
    "exchange_rule",
    "item_meta__diversion_attempts",
    "store_name",
    "item_meta__delivered_by",
    "codamount",
    "exchange_code",
    "cancelled_at",
    "item_meta__seller_acp_or_rej_by",
    "order_status",
    "fulfilled_store_id",
    "item_meta__delivery_part_select_by_time",
    "item_cod_amount",
    "bundled_warranty__amount",
    "exchange_dis",
    "shipment__created_at",
    "shipment__type",
    "item_meta__delivery_part_cancelled_by",
    "item_discounted_price",
    "item_wallet_discount",
    "fulfilled_item_gross",
    "item_meta__edit_delivery_mode_by_timestamp",
    "order_item_gross",
    "is_cancelled_user",
    "order_summary__lat",
    "retailer_status",
    "total_amount",
    "product_title",
    "order_summary__pg",
    "item_meta__delivery_part_cancelled_by_time",
    "store_locality",
    "product_id",
    "created_at",
    "item_meta__delivery_part_select_by",
    "offer_description",
    "retailer_status_last_updated",
    "is_cancelled_sales",
    "online_amount",
    "payment_type",
    "shipment__shipment_id",
    "item_meta__diverted_reason",
    "shipment__out_for_delivery_timestamp",
    "quantity",
    "bundled_warranty__sales_status",
    "order_status_modified_at"
})
public class Item {

    @JsonProperty("comment")
    private String comment;
    @JsonProperty("order_summary__comment")
    private String orderSummaryComment;
    @JsonProperty("bundled_warranty__duration")
    private String bundledWarrantyDuration;
    @JsonProperty("item_online_amount")
    private long itemOnlineAmount;
    @JsonProperty("store_id")
    private long storeId;
    @JsonProperty("is_retailer_cancelled")
    private boolean isRetailerCancelled;
    @JsonProperty("order_item_discount")
    private long orderItemDiscount;
    @JsonProperty("item_meta__seller_diverted_by_time")
    private String itemMetaSellerDivertedByTime;
    @JsonProperty("item_meta__edit_delivery_mode_by")
    private String itemMetaEditDeliveryModeBy;
    @JsonProperty("shipment__delivery_timestamp")
    private String shipmentDeliveryTimestamp;
    @JsonProperty("order_summary__lng")
    private double orderSummaryLng;
    @JsonProperty("item_meta__seller_diverted_by")
    private String itemMetaSellerDivertedBy;
    @JsonProperty("coupon_discount")
    private long couponDiscount;
    @JsonProperty("shipping_charges")
    private long shippingCharges;
    @JsonProperty("item_meta__ofd_by")
    private String itemMetaOfdBy;
    @JsonProperty("retailer_acceptance_time")
    private String retailerAcceptanceTime;
    @JsonProperty("item_meta__cancellation_done_by")
    private String itemMetaCancellationDoneBy;
    @JsonProperty("item_meta__shipment_gen_by")
    private String itemMetaShipmentGenBy;
    @JsonProperty("order_item_total")
    private long orderItemTotal;
    @JsonProperty("exchange_discount")
    private long exchangeDiscount;
    @JsonProperty("id")
    private long id;
    @JsonProperty("cancel_reason")
    private String cancelReason;
    @JsonProperty("has_warranty")
    private boolean hasWarranty;
    @JsonProperty("is_exchange_applied")
    private boolean isExchangeApplied;
    @JsonProperty("shipment__shipment_status")
    private String shipmentShipmentStatus;
    @JsonProperty("order_summary__cod_amount")
    private long orderSummaryCodAmount;
    @JsonProperty("shipment__delivery_partner__name")
    private String shipmentDeliveryPartnerName;
    @JsonProperty("cancellation_reason")
    private String cancellationReason;
    @JsonProperty("unit_price")
    private long unitPrice;
    @JsonProperty("exchange_rule")
    private String exchangeRule;
    @JsonProperty("item_meta__diversion_attempts")
    private long itemMetaDiversionAttempts;
    @JsonProperty("store_name")
    private String storeName;
    @JsonProperty("item_meta__delivered_by")
    private String itemMetaDeliveredBy;
    @JsonProperty("codamount")
    private long codamount;
    @JsonProperty("exchange_code")
    private String exchangeCode;
    @JsonProperty("cancelled_at")
    private String cancelledAt;
    @JsonProperty("item_meta__seller_acp_or_rej_by")
    private String itemMetaSellerAcpOrRejBy;
    @JsonProperty("order_status")
    private String orderStatus;
    @JsonProperty("fulfilled_store_id")
    private long fulfilledStoreId;
    @JsonProperty("item_meta__delivery_part_select_by_time")
    private String itemMetaDeliveryPartSelectByTime;
    @JsonProperty("item_cod_amount")
    private long itemCodAmount;
    @JsonProperty("bundled_warranty__amount")
    private String bundledWarrantyAmount;
    @JsonProperty("exchange_dis")
    private long exchangeDis;
    @JsonProperty("shipment__created_at")
    private String shipmentCreatedAt;
    @JsonProperty("shipment__type")
    private String shipmentType;
    @JsonProperty("item_meta__delivery_part_cancelled_by")
    private String itemMetaDeliveryPartCancelledBy;
    @JsonProperty("item_discounted_price")
    private long itemDiscountedPrice;
    @JsonProperty("item_wallet_discount")
    private long itemWalletDiscount;
    @JsonProperty("fulfilled_item_gross")
    private long fulfilledItemGross;
    @JsonProperty("item_meta__edit_delivery_mode_by_timestamp")
    private String itemMetaEditDeliveryModeByTimestamp;
    @JsonProperty("order_item_gross")
    private long orderItemGross;
    @JsonProperty("is_cancelled_user")
    private boolean isCancelledUser;
    @JsonProperty("order_summary__lat")
    private double orderSummaryLat;
    @JsonProperty("retailer_status")
    private String retailerStatus;
    @JsonProperty("total_amount")
    private long totalAmount;
    @JsonProperty("product_title")
    private String productTitle;
    @JsonProperty("order_summary__pg")
    private String orderSummaryPg;
    @JsonProperty("item_meta__delivery_part_cancelled_by_time")
    private String itemMetaDeliveryPartCancelledByTime;
    @JsonProperty("store_locality")
    private String storeLocality;
    @JsonProperty("product_id")
    private long productId;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("item_meta__delivery_part_select_by")
    private String itemMetaDeliveryPartSelectBy;
    @JsonProperty("offer_description")
    private String offerDescription;
    @JsonProperty("retailer_status_last_updated")
    private String retailerStatusLastUpdated;
    @JsonProperty("is_cancelled_sales")
    private boolean isCancelledSales;
    @JsonProperty("online_amount")
    private long onlineAmount;
    @JsonProperty("payment_type")
    private String paymentType;
    @JsonProperty("shipment__shipment_id")
    private String shipmentShipmentId;
    @JsonProperty("item_meta__diverted_reason")
    private String itemMetaDivertedReason;
    @JsonProperty("shipment__out_for_delivery_timestamp")
    private String shipmentOutForDeliveryTimestamp;
    @JsonProperty("quantity")
    private long quantity;
    @JsonProperty("bundled_warranty__sales_status")
    private String bundledWarrantySalesStatus;
    @JsonProperty("order_status_modified_at")
    private String orderStatusModifiedAt;

    /**
     * 
     * @return
     *     The comment
     */
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    /**
     * 
     * @param comment
     *     The comment
     */
    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * 
     * @return
     *     The orderSummaryComment
     */
    @JsonProperty("order_summary__comment")
    public String getOrderSummaryComment() {
        return orderSummaryComment;
    }

    /**
     * 
     * @param orderSummaryComment
     *     The order_summary__comment
     */
    @JsonProperty("order_summary__comment")
    public void setOrderSummaryComment(String orderSummaryComment) {
        this.orderSummaryComment = orderSummaryComment;
    }

    /**
     * 
     * @return
     *     The bundledWarrantyDuration
     */
    @JsonProperty("bundled_warranty__duration")
    public String getBundledWarrantyDuration() {
        return bundledWarrantyDuration;
    }

    /**
     * 
     * @param bundledWarrantyDuration
     *     The bundled_warranty__duration
     */
    @JsonProperty("bundled_warranty__duration")
    public void setBundledWarrantyDuration(String bundledWarrantyDuration) {
        this.bundledWarrantyDuration = bundledWarrantyDuration;
    }

    /**
     * 
     * @return
     *     The itemOnlineAmount
     */
    @JsonProperty("item_online_amount")
    public long getItemOnlineAmount() {
        return itemOnlineAmount;
    }

    /**
     * 
     * @param itemOnlineAmount
     *     The item_online_amount
     */
    @JsonProperty("item_online_amount")
    public void setItemOnlineAmount(long itemOnlineAmount) {
        this.itemOnlineAmount = itemOnlineAmount;
    }

    /**
     * 
     * @return
     *     The storeId
     */
    @JsonProperty("store_id")
    public long getStoreId() {
        return storeId;
    }

    /**
     * 
     * @param storeId
     *     The store_id
     */
    @JsonProperty("store_id")
    public void setStoreId(long storeId) {
        this.storeId = storeId;
    }

    /**
     * 
     * @return
     *     The isRetailerCancelled
     */
    @JsonProperty("is_retailer_cancelled")
    public boolean isIsRetailerCancelled() {
        return isRetailerCancelled;
    }

    /**
     * 
     * @param isRetailerCancelled
     *     The is_retailer_cancelled
     */
    @JsonProperty("is_retailer_cancelled")
    public void setIsRetailerCancelled(boolean isRetailerCancelled) {
        this.isRetailerCancelled = isRetailerCancelled;
    }

    /**
     * 
     * @return
     *     The orderItemDiscount
     */
    @JsonProperty("order_item_discount")
    public long getOrderItemDiscount() {
        return orderItemDiscount;
    }

    /**
     * 
     * @param orderItemDiscount
     *     The order_item_discount
     */
    @JsonProperty("order_item_discount")
    public void setOrderItemDiscount(long orderItemDiscount) {
        this.orderItemDiscount = orderItemDiscount;
    }

    /**
     * 
     * @return
     *     The itemMetaSellerDivertedByTime
     */
    @JsonProperty("item_meta__seller_diverted_by_time")
    public String getItemMetaSellerDivertedByTime() {
        return itemMetaSellerDivertedByTime;
    }

    /**
     * 
     * @param itemMetaSellerDivertedByTime
     *     The item_meta__seller_diverted_by_time
     */
    @JsonProperty("item_meta__seller_diverted_by_time")
    public void setItemMetaSellerDivertedByTime(String itemMetaSellerDivertedByTime) {
        this.itemMetaSellerDivertedByTime = itemMetaSellerDivertedByTime;
    }

    /**
     * 
     * @return
     *     The itemMetaEditDeliveryModeBy
     */
    @JsonProperty("item_meta__edit_delivery_mode_by")
    public String getItemMetaEditDeliveryModeBy() {
        return itemMetaEditDeliveryModeBy;
    }

    /**
     *
     * @return
     *     The shipmentDeliveryTimestamp
     */
    @JsonProperty("shipment__delivery_timestamp")
    public String getShipmentDeliveryTimestamp() {
        return shipmentDeliveryTimestamp;
    }

    /**
     *
     * @param itemMetaEditDeliveryModeBy
     *     The item_meta__edit_delivery_mode_by
     */
    @JsonProperty("item_meta__edit_delivery_mode_by")
    public void setItemMetaEditDeliveryModeBy(String itemMetaEditDeliveryModeBy) {
        this.itemMetaEditDeliveryModeBy = itemMetaEditDeliveryModeBy;
    }

    /**
     * 
     * @param shipmentDeliveryTimestamp
     *     The shipment__delivery_timestamp
     */
    @JsonProperty("shipment__delivery_timestamp")
    public void setShipmentDeliveryTimestamp(String shipmentDeliveryTimestamp) {
        this.shipmentDeliveryTimestamp = shipmentDeliveryTimestamp;
    }

    /**
     * 
     * @return
     *     The orderSummaryLng
     */
    @JsonProperty("order_summary__lng")
    public double getOrderSummaryLng() {
        return orderSummaryLng;
    }

    /**
     * 
     * @param orderSummaryLng
     *     The order_summary__lng
     */
    @JsonProperty("order_summary__lng")
    public void setOrderSummaryLng(double orderSummaryLng) {
        this.orderSummaryLng = orderSummaryLng;
    }

    /**
     * 
     * @return
     *     The itemMetaSellerDivertedBy
     */
    @JsonProperty("item_meta__seller_diverted_by")
    public String getItemMetaSellerDivertedBy() {
        return itemMetaSellerDivertedBy;
    }

    /**
     * 
     * @param itemMetaSellerDivertedBy
     *     The item_meta__seller_diverted_by
     */
    @JsonProperty("item_meta__seller_diverted_by")
    public void setItemMetaSellerDivertedBy(String itemMetaSellerDivertedBy) {
        this.itemMetaSellerDivertedBy = itemMetaSellerDivertedBy;
    }

    /**
     * 
     * @return
     *     The couponDiscount
     */
    @JsonProperty("coupon_discount")
    public long getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * 
     * @param couponDiscount
     *     The coupon_discount
     */
    @JsonProperty("coupon_discount")
    public void setCouponDiscount(long couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    /**
     * 
     * @return
     *     The shippingCharges
     */
    @JsonProperty("shipping_charges")
    public long getShippingCharges() {
        return shippingCharges;
    }

    /**
     * 
     * @param shippingCharges
     *     The shipping_charges
     */
    @JsonProperty("shipping_charges")
    public void setShippingCharges(long shippingCharges) {
        this.shippingCharges = shippingCharges;
    }

    /**
     * 
     * @return
     *     The itemMetaOfdBy
     */
    @JsonProperty("item_meta__ofd_by")
    public String getItemMetaOfdBy() {
        return itemMetaOfdBy;
    }

    /**
     * 
     * @param itemMetaOfdBy
     *     The item_meta__ofd_by
     */
    @JsonProperty("item_meta__ofd_by")
    public void setItemMetaOfdBy(String itemMetaOfdBy) {
        this.itemMetaOfdBy = itemMetaOfdBy;
    }

    /**
     * 
     * @return
     *     The retailerAcceptanceTime
     */
    @JsonProperty("retailer_acceptance_time")
    public String getRetailerAcceptanceTime() {
        return retailerAcceptanceTime;
    }

    /**
     * 
     * @param retailerAcceptanceTime
     *     The retailer_acceptance_time
     */
    @JsonProperty("retailer_acceptance_time")
    public void setRetailerAcceptanceTime(String retailerAcceptanceTime) {
        this.retailerAcceptanceTime = retailerAcceptanceTime;
    }

    /**
     * 
     * @return
     *     The itemMetaCancellationDoneBy
     */
    @JsonProperty("item_meta__cancellation_done_by")
    public String getItemMetaCancellationDoneBy() {
        return itemMetaCancellationDoneBy;
    }

    /**
     * 
     * @param itemMetaCancellationDoneBy
     *     The item_meta__cancellation_done_by
     */
    @JsonProperty("item_meta__cancellation_done_by")
    public void setItemMetaCancellationDoneBy(String itemMetaCancellationDoneBy) {
        this.itemMetaCancellationDoneBy = itemMetaCancellationDoneBy;
    }

    /**
     * 
     * @return
     *     The itemMetaShipmentGenBy
     */
    @JsonProperty("item_meta__shipment_gen_by")
    public String getItemMetaShipmentGenBy() {
        return itemMetaShipmentGenBy;
    }

    /**
     * 
     * @param itemMetaShipmentGenBy
     *     The item_meta__shipment_gen_by
     */
    @JsonProperty("item_meta__shipment_gen_by")
    public void setItemMetaShipmentGenBy(String itemMetaShipmentGenBy) {
        this.itemMetaShipmentGenBy = itemMetaShipmentGenBy;
    }

    /**
     * 
     * @return
     *     The orderItemTotal
     */
    @JsonProperty("order_item_total")
    public long getOrderItemTotal() {
        return orderItemTotal;
    }

    /**
     * 
     * @param orderItemTotal
     *     The order_item_total
     */
    @JsonProperty("order_item_total")
    public void setOrderItemTotal(long orderItemTotal) {
        this.orderItemTotal = orderItemTotal;
    }

    /**
     * 
     * @return
     *     The exchangeDiscount
     */
    @JsonProperty("exchange_discount")
    public long getExchangeDiscount() {
        return exchangeDiscount;
    }

    /**
     * 
     * @param exchangeDiscount
     *     The exchange_discount
     */
    @JsonProperty("exchange_discount")
    public void setExchangeDiscount(long exchangeDiscount) {
        this.exchangeDiscount = exchangeDiscount;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The cancelReason
     */
    @JsonProperty("cancel_reason")
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * 
     * @param cancelReason
     *     The cancel_reason
     */
    @JsonProperty("cancel_reason")
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * 
     * @return
     *     The hasWarranty
     */
    @JsonProperty("has_warranty")
    public boolean isHasWarranty() {
        return hasWarranty;
    }

    /**
     * 
     * @param hasWarranty
     *     The has_warranty
     */
    @JsonProperty("has_warranty")
    public void setHasWarranty(boolean hasWarranty) {
        this.hasWarranty = hasWarranty;
    }

    /**
     * 
     * @return
     *     The isExchangeApplied
     */
    @JsonProperty("is_exchange_applied")
    public boolean isIsExchangeApplied() {
        return isExchangeApplied;
    }

    /**
     * 
     * @param isExchangeApplied
     *     The is_exchange_applied
     */
    @JsonProperty("is_exchange_applied")
    public void setIsExchangeApplied(boolean isExchangeApplied) {
        this.isExchangeApplied = isExchangeApplied;
    }

    /**
     * 
     * @return
     *     The shipmentShipmentStatus
     */
    @JsonProperty("shipment__shipment_status")
    public String getShipmentShipmentStatus() {
        return shipmentShipmentStatus;
    }

    /**
     * 
     * @param shipmentShipmentStatus
     *     The shipment__shipment_status
     */
    @JsonProperty("shipment__shipment_status")
    public void setShipmentShipmentStatus(String shipmentShipmentStatus) {
        this.shipmentShipmentStatus = shipmentShipmentStatus;
    }

    /**
     * 
     * @return
     *     The orderSummaryCodAmount
     */
    @JsonProperty("order_summary__cod_amount")
    public long getOrderSummaryCodAmount() {
        return orderSummaryCodAmount;
    }

    /**
     * 
     * @param orderSummaryCodAmount
     *     The order_summary__cod_amount
     */
    @JsonProperty("order_summary__cod_amount")
    public void setOrderSummaryCodAmount(long orderSummaryCodAmount) {
        this.orderSummaryCodAmount = orderSummaryCodAmount;
    }

    /**
     * 
     * @return
     *     The shipmentDeliveryPartnerName
     */
    @JsonProperty("shipment__delivery_partner__name")
    public String getShipmentDeliveryPartnerName() {
        return shipmentDeliveryPartnerName;
    }

    /**
     * 
     * @param shipmentDeliveryPartnerName
     *     The shipment__delivery_partner__name
     */
    @JsonProperty("shipment__delivery_partner__name")
    public void setShipmentDeliveryPartnerName(String shipmentDeliveryPartnerName) {
        this.shipmentDeliveryPartnerName = shipmentDeliveryPartnerName;
    }

    /**
     * 
     * @return
     *     The cancellationReason
     */
    @JsonProperty("cancellation_reason")
    public String getCancellationReason() {
        return cancellationReason;
    }

    /**
     * 
     * @param cancellationReason
     *     The cancellation_reason
     */
    @JsonProperty("cancellation_reason")
    public void setCancellationReason(String cancellationReason) {
        this.cancellationReason = cancellationReason;
    }

    /**
     * 
     * @return
     *     The unitPrice
     */
    @JsonProperty("unit_price")
    public long getUnitPrice() {
        return unitPrice;
    }

    /**
     * 
     * @param unitPrice
     *     The unit_price
     */
    @JsonProperty("unit_price")
    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * 
     * @return
     *     The exchangeRule
     */
    @JsonProperty("exchange_rule")
    public String getExchangeRule() {
        return exchangeRule;
    }

    /**
     * 
     * @param exchangeRule
     *     The exchange_rule
     */
    @JsonProperty("exchange_rule")
    public void setExchangeRule(String exchangeRule) {
        this.exchangeRule = exchangeRule;
    }

    /**
     * 
     * @return
     *     The itemMetaDiversionAttempts
     */
    @JsonProperty("item_meta__diversion_attempts")
    public long getItemMetaDiversionAttempts() {
        return itemMetaDiversionAttempts;
    }

    /**
     * 
     * @param itemMetaDiversionAttempts
     *     The item_meta__diversion_attempts
     */
    @JsonProperty("item_meta__diversion_attempts")
    public void setItemMetaDiversionAttempts(long itemMetaDiversionAttempts) {
        this.itemMetaDiversionAttempts = itemMetaDiversionAttempts;
    }

    /**
     * 
     * @return
     *     The storeName
     */
    @JsonProperty("store_name")
    public String getStoreName() {
        return storeName;
    }

    /**
     * 
     * @param storeName
     *     The store_name
     */
    @JsonProperty("store_name")
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    /**
     * 
     * @return
     *     The itemMetaDeliveredBy
     */
    @JsonProperty("item_meta__delivered_by")
    public String getItemMetaDeliveredBy() {
        return itemMetaDeliveredBy;
    }

    /**
     * 
     * @param itemMetaDeliveredBy
     *     The item_meta__delivered_by
     */
    @JsonProperty("item_meta__delivered_by")
    public void setItemMetaDeliveredBy(String itemMetaDeliveredBy) {
        this.itemMetaDeliveredBy = itemMetaDeliveredBy;
    }

    /**
     * 
     * @return
     *     The codamount
     */
    @JsonProperty("codamount")
    public long getCodamount() {
        return codamount;
    }

    /**
     * 
     * @param codamount
     *     The codamount
     */
    @JsonProperty("codamount")
    public void setCodamount(long codamount) {
        this.codamount = codamount;
    }

    /**
     * 
     * @return
     *     The exchangeCode
     */
    @JsonProperty("exchange_code")
    public String getExchangeCode() {
        return exchangeCode;
    }

    /**
     * 
     * @param exchangeCode
     *     The exchange_code
     */
    @JsonProperty("exchange_code")
    public void setExchangeCode(String exchangeCode) {
        this.exchangeCode = exchangeCode;
    }

    /**
     * 
     * @return
     *     The cancelledAt
     */
    @JsonProperty("cancelled_at")
    public String getCancelledAt() {
        return cancelledAt;
    }

    /**
     * 
     * @param cancelledAt
     *     The cancelled_at
     */
    @JsonProperty("cancelled_at")
    public void setCancelledAt(String cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    /**
     * 
     * @return
     *     The itemMetaSellerAcpOrRejBy
     */
    @JsonProperty("item_meta__seller_acp_or_rej_by")
    public String getItemMetaSellerAcpOrRejBy() {
        return itemMetaSellerAcpOrRejBy;
    }

    /**
     * 
     * @param itemMetaSellerAcpOrRejBy
     *     The item_meta__seller_acp_or_rej_by
     */
    @JsonProperty("item_meta__seller_acp_or_rej_by")
    public void setItemMetaSellerAcpOrRejBy(String itemMetaSellerAcpOrRejBy) {
        this.itemMetaSellerAcpOrRejBy = itemMetaSellerAcpOrRejBy;
    }

    /**
     * 
     * @return
     *     The orderStatus
     */
    @JsonProperty("order_status")
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 
     * @param orderStatus
     *     The order_status
     */
    @JsonProperty("order_status")
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 
     * @return
     *     The fulfilledStoreId
     */
    @JsonProperty("fulfilled_store_id")
    public long getFulfilledStoreId() {
        return fulfilledStoreId;
    }

    /**
     * 
     * @param fulfilledStoreId
     *     The fulfilled_store_id
     */
    @JsonProperty("fulfilled_store_id")
    public void setFulfilledStoreId(long fulfilledStoreId) {
        this.fulfilledStoreId = fulfilledStoreId;
    }

    /**
     * 
     * @return
     *     The itemMetaDeliveryPartSelectByTime
     */
    @JsonProperty("item_meta__delivery_part_select_by_time")
    public String getItemMetaDeliveryPartSelectByTime() {
        return itemMetaDeliveryPartSelectByTime;
    }

    /**
     * 
     * @param itemMetaDeliveryPartSelectByTime
     *     The item_meta__delivery_part_select_by_time
     */
    @JsonProperty("item_meta__delivery_part_select_by_time")
    public void setItemMetaDeliveryPartSelectByTime(String itemMetaDeliveryPartSelectByTime) {
        this.itemMetaDeliveryPartSelectByTime = itemMetaDeliveryPartSelectByTime;
    }

    /**
     * 
     * @return
     *     The itemCodAmount
     */
    @JsonProperty("item_cod_amount")
    public long getItemCodAmount() {
        return itemCodAmount;
    }

    /**
     * 
     * @param itemCodAmount
     *     The item_cod_amount
     */
    @JsonProperty("item_cod_amount")
    public void setItemCodAmount(long itemCodAmount) {
        this.itemCodAmount = itemCodAmount;
    }

    /**
     * 
     * @return
     *     The bundledWarrantyAmount
     */
    @JsonProperty("bundled_warranty__amount")
    public String getBundledWarrantyAmount() {
        return bundledWarrantyAmount;
    }

    /**
     * 
     * @param bundledWarrantyAmount
     *     The bundled_warranty__amount
     */
    @JsonProperty("bundled_warranty__amount")
    public void setBundledWarrantyAmount(String bundledWarrantyAmount) {
        this.bundledWarrantyAmount = bundledWarrantyAmount;
    }

    /**
     * 
     * @return
     *     The exchangeDis
     */
    @JsonProperty("exchange_dis")
    public long getExchangeDis() {
        return exchangeDis;
    }

    /**
     * 
     * @param exchangeDis
     *     The exchange_dis
     */
    @JsonProperty("exchange_dis")
    public void setExchangeDis(long exchangeDis) {
        this.exchangeDis = exchangeDis;
    }

    /**
     * 
     * @return
     *     The shipmentCreatedAt
     */
    @JsonProperty("shipment__created_at")
    public String getShipmentCreatedAt() {
        return shipmentCreatedAt;
    }

    /**
     * 
     * @param shipmentCreatedAt
     *     The shipment__created_at
     */
    @JsonProperty("shipment__created_at")
    public void setShipmentCreatedAt(String shipmentCreatedAt) {
        this.shipmentCreatedAt = shipmentCreatedAt;
    }

    /**
     * 
     * @return
     *     The shipmentType
     */
    @JsonProperty("shipment__type")
    public String getShipmentType() {
        return shipmentType;
    }

    /**
     * 
     * @param shipmentType
     *     The shipment__type
     */
    @JsonProperty("shipment__type")
    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    /**
     * 
     * @return
     *     The itemMetaDeliveryPartCancelledBy
     */
    @JsonProperty("item_meta__delivery_part_cancelled_by")
    public String getItemMetaDeliveryPartCancelledBy() {
        return itemMetaDeliveryPartCancelledBy;
    }

    /**
     * 
     * @param itemMetaDeliveryPartCancelledBy
     *     The item_meta__delivery_part_cancelled_by
     */
    @JsonProperty("item_meta__delivery_part_cancelled_by")
    public void setItemMetaDeliveryPartCancelledBy(String itemMetaDeliveryPartCancelledBy) {
        this.itemMetaDeliveryPartCancelledBy = itemMetaDeliveryPartCancelledBy;
    }

    /**
     * 
     * @return
     *     The itemDiscountedPrice
     */
    @JsonProperty("item_discounted_price")
    public long getItemDiscountedPrice() {
        return itemDiscountedPrice;
    }

    /**
     * 
     * @param itemDiscountedPrice
     *     The item_discounted_price
     */
    @JsonProperty("item_discounted_price")
    public void setItemDiscountedPrice(long itemDiscountedPrice) {
        this.itemDiscountedPrice = itemDiscountedPrice;
    }

    /**
     * 
     * @return
     *     The itemWalletDiscount
     */
    @JsonProperty("item_wallet_discount")
    public long getItemWalletDiscount() {
        return itemWalletDiscount;
    }

    /**
     * 
     * @param itemWalletDiscount
     *     The item_wallet_discount
     */
    @JsonProperty("item_wallet_discount")
    public void setItemWalletDiscount(long itemWalletDiscount) {
        this.itemWalletDiscount = itemWalletDiscount;
    }

    /**
     * 
     * @return
     *     The fulfilledItemGross
     */
    @JsonProperty("fulfilled_item_gross")
    public long getFulfilledItemGross() {
        return fulfilledItemGross;
    }

    /**
     * 
     * @param fulfilledItemGross
     *     The fulfilled_item_gross
     */
    @JsonProperty("fulfilled_item_gross")
    public void setFulfilledItemGross(long fulfilledItemGross) {
        this.fulfilledItemGross = fulfilledItemGross;
    }

    /**
     * 
     * @return
     *     The itemMetaEditDeliveryModeByTimestamp
     */
    @JsonProperty("item_meta__edit_delivery_mode_by_timestamp")
    public String getItemMetaEditDeliveryModeByTimestamp() {
        return itemMetaEditDeliveryModeByTimestamp;
    }

    /**
     * 
     * @param itemMetaEditDeliveryModeByTimestamp
     *     The item_meta__edit_delivery_mode_by_timestamp
     */
    @JsonProperty("item_meta__edit_delivery_mode_by_timestamp")
    public void setItemMetaEditDeliveryModeByTimestamp(String itemMetaEditDeliveryModeByTimestamp) {
        this.itemMetaEditDeliveryModeByTimestamp = itemMetaEditDeliveryModeByTimestamp;
    }

    /**
     * 
     * @return
     *     The orderItemGross
     */
    @JsonProperty("order_item_gross")
    public long getOrderItemGross() {
        return orderItemGross;
    }

    /**
     * 
     * @param orderItemGross
     *     The order_item_gross
     */
    @JsonProperty("order_item_gross")
    public void setOrderItemGross(long orderItemGross) {
        this.orderItemGross = orderItemGross;
    }

    /**
     * 
     * @return
     *     The isCancelledUser
     */
    @JsonProperty("is_cancelled_user")
    public boolean isIsCancelledUser() {
        return isCancelledUser;
    }

    /**
     * 
     * @param isCancelledUser
     *     The is_cancelled_user
     */
    @JsonProperty("is_cancelled_user")
    public void setIsCancelledUser(boolean isCancelledUser) {
        this.isCancelledUser = isCancelledUser;
    }

    /**
     * 
     * @return
     *     The orderSummaryLat
     */
    @JsonProperty("order_summary__lat")
    public double getOrderSummaryLat() {
        return orderSummaryLat;
    }

    /**
     * 
     * @param orderSummaryLat
     *     The order_summary__lat
     */
    @JsonProperty("order_summary__lat")
    public void setOrderSummaryLat(double orderSummaryLat) {
        this.orderSummaryLat = orderSummaryLat;
    }

    /**
     * 
     * @return
     *     The retailerStatus
     */
    @JsonProperty("retailer_status")
    public String getRetailerStatus() {
        return retailerStatus;
    }

    /**
     * 
     * @param retailerStatus
     *     The retailer_status
     */
    @JsonProperty("retailer_status")
    public void setRetailerStatus(String retailerStatus) {
        this.retailerStatus = retailerStatus;
    }

    /**
     * 
     * @return
     *     The totalAmount
     */
    @JsonProperty("total_amount")
    public long getTotalAmount() {
        return totalAmount;
    }

    /**
     * 
     * @param totalAmount
     *     The total_amount
     */
    @JsonProperty("total_amount")
    public void setTotalAmount(long totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * 
     * @return
     *     The productTitle
     */
    @JsonProperty("product_title")
    public String getProductTitle() {
        return productTitle;
    }

    /**
     * 
     * @param productTitle
     *     The product_title
     */
    @JsonProperty("product_title")
    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    /**
     * 
     * @return
     *     The orderSummaryPg
     */
    @JsonProperty("order_summary__pg")
    public String getOrderSummaryPg() {
        return orderSummaryPg;
    }

    /**
     * 
     * @param orderSummaryPg
     *     The order_summary__pg
     */
    @JsonProperty("order_summary__pg")
    public void setOrderSummaryPg(String orderSummaryPg) {
        this.orderSummaryPg = orderSummaryPg;
    }

    /**
     * 
     * @return
     *     The itemMetaDeliveryPartCancelledByTime
     */
    @JsonProperty("item_meta__delivery_part_cancelled_by_time")
    public String getItemMetaDeliveryPartCancelledByTime() {
        return itemMetaDeliveryPartCancelledByTime;
    }

    /**
     * 
     * @param itemMetaDeliveryPartCancelledByTime
     *     The item_meta__delivery_part_cancelled_by_time
     */
    @JsonProperty("item_meta__delivery_part_cancelled_by_time")
    public void setItemMetaDeliveryPartCancelledByTime(String itemMetaDeliveryPartCancelledByTime) {
        this.itemMetaDeliveryPartCancelledByTime = itemMetaDeliveryPartCancelledByTime;
    }

    /**
     * 
     * @return
     *     The storeLocality
     */
    @JsonProperty("store_locality")
    public String getStoreLocality() {
        return storeLocality;
    }

    /**
     * 
     * @param storeLocality
     *     The store_locality
     */
    @JsonProperty("store_locality")
    public void setStoreLocality(String storeLocality) {
        this.storeLocality = storeLocality;
    }

    /**
     * 
     * @return
     *     The productId
     */
    @JsonProperty("product_id")
    public long getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The product_id
     */
    @JsonProperty("product_id")
    public void setProductId(long productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return
     *     The itemMetaDeliveryPartSelectBy
     */
    @JsonProperty("item_meta__delivery_part_select_by")
    public String getItemMetaDeliveryPartSelectBy() {
        return itemMetaDeliveryPartSelectBy;
    }

    /**
     * 
     * @param itemMetaDeliveryPartSelectBy
     *     The item_meta__delivery_part_select_by
     */
    @JsonProperty("item_meta__delivery_part_select_by")
    public void setItemMetaDeliveryPartSelectBy(String itemMetaDeliveryPartSelectBy) {
        this.itemMetaDeliveryPartSelectBy = itemMetaDeliveryPartSelectBy;
    }

    /**
     * 
     * @return
     *     The offerDescription
     */
    @JsonProperty("offer_description")
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * 
     * @param offerDescription
     *     The offer_description
     */
    @JsonProperty("offer_description")
    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    /**
     * 
     * @return
     *     The retailerStatusLastUpdated
     */
    @JsonProperty("retailer_status_last_updated")
    public String getRetailerStatusLastUpdated() {
        return retailerStatusLastUpdated;
    }

    /**
     * 
     * @param retailerStatusLastUpdated
     *     The retailer_status_last_updated
     */
    @JsonProperty("retailer_status_last_updated")
    public void setRetailerStatusLastUpdated(String retailerStatusLastUpdated) {
        this.retailerStatusLastUpdated = retailerStatusLastUpdated;
    }

    /**
     * 
     * @return
     *     The isCancelledSales
     */
    @JsonProperty("is_cancelled_sales")
    public boolean isIsCancelledSales() {
        return isCancelledSales;
    }

    /**
     * 
     * @param isCancelledSales
     *     The is_cancelled_sales
     */
    @JsonProperty("is_cancelled_sales")
    public void setIsCancelledSales(boolean isCancelledSales) {
        this.isCancelledSales = isCancelledSales;
    }

    /**
     * 
     * @return
     *     The onlineAmount
     */
    @JsonProperty("online_amount")
    public long getOnlineAmount() {
        return onlineAmount;
    }

    /**
     * 
     * @param onlineAmount
     *     The online_amount
     */
    @JsonProperty("online_amount")
    public void setOnlineAmount(long onlineAmount) {
        this.onlineAmount = onlineAmount;
    }

    /**
     * 
     * @return
     *     The paymentType
     */
    @JsonProperty("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 
     * @param paymentType
     *     The payment_type
     */
    @JsonProperty("payment_type")
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 
     * @return
     *     The shipmentShipmentId
     */
    @JsonProperty("shipment__shipment_id")
    public String getShipmentShipmentId() {
        return shipmentShipmentId;
    }

    /**
     * 
     * @param shipmentShipmentId
     *     The shipment__shipment_id
     */
    @JsonProperty("shipment__shipment_id")
    public void setShipmentShipmentId(String shipmentShipmentId) {
        this.shipmentShipmentId = shipmentShipmentId;
    }

    /**
     * 
     * @return
     *     The itemMetaDivertedReason
     */
    @JsonProperty("item_meta__diverted_reason")
    public String getItemMetaDivertedReason() {
        return itemMetaDivertedReason;
    }

    /**
     * 
     * @param itemMetaDivertedReason
     *     The item_meta__diverted_reason
     */
    @JsonProperty("item_meta__diverted_reason")
    public void setItemMetaDivertedReason(String itemMetaDivertedReason) {
        this.itemMetaDivertedReason = itemMetaDivertedReason;
    }

    /**
     * 
     * @return
     *     The shipmentOutForDeliveryTimestamp
     */
    @JsonProperty("shipment__out_for_delivery_timestamp")
    public String getShipmentOutForDeliveryTimestamp() {
        return shipmentOutForDeliveryTimestamp;
    }

    /**
     * 
     * @param shipmentOutForDeliveryTimestamp
     *     The shipment__out_for_delivery_timestamp
     */
    @JsonProperty("shipment__out_for_delivery_timestamp")
    public void setShipmentOutForDeliveryTimestamp(String shipmentOutForDeliveryTimestamp) {
        this.shipmentOutForDeliveryTimestamp = shipmentOutForDeliveryTimestamp;
    }

    /**
     * 
     * @return
     *     The quantity
     */
    @JsonProperty("quantity")
    public long getQuantity() {
        return quantity;
    }

    /**
     * 
     * @param quantity
     *     The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    /**
     * 
     * @return
     *     The bundledWarrantySalesStatus
     */
    @JsonProperty("bundled_warranty__sales_status")
    public String getBundledWarrantySalesStatus() {
        return bundledWarrantySalesStatus;
    }

    /**
     * 
     * @param bundledWarrantySalesStatus
     *     The bundled_warranty__sales_status
     */
    @JsonProperty("bundled_warranty__sales_status")
    public void setBundledWarrantySalesStatus(String bundledWarrantySalesStatus) {
        this.bundledWarrantySalesStatus = bundledWarrantySalesStatus;
    }

    /**
     * 
     * @return
     *     The orderStatusModifiedAt
     */
    @JsonProperty("order_status_modified_at")
    public String getOrderStatusModifiedAt() {
        return orderStatusModifiedAt;
    }

    /**
     * 
     * @param orderStatusModifiedAt
     *     The order_status_modified_at
     */
    @JsonProperty("order_status_modified_at")
    public void setOrderStatusModifiedAt(String orderStatusModifiedAt) {
        this.orderStatusModifiedAt = orderStatusModifiedAt;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(comment).append(orderSummaryComment).append(bundledWarrantyDuration).append(itemOnlineAmount).append(storeId).append(isRetailerCancelled).append(orderItemDiscount).append(itemMetaSellerDivertedByTime).append(itemMetaEditDeliveryModeBy).append(shipmentDeliveryTimestamp).append(orderSummaryLng).append(itemMetaSellerDivertedBy).append(couponDiscount).append(shippingCharges).append(itemMetaOfdBy).append(retailerAcceptanceTime).append(itemMetaCancellationDoneBy).append(itemMetaShipmentGenBy).append(orderItemTotal).append(exchangeDiscount).append(id).append(cancelReason).append(hasWarranty).append(isExchangeApplied).append(shipmentShipmentStatus).append(orderSummaryCodAmount).append(shipmentDeliveryPartnerName).append(cancellationReason).append(unitPrice).append(exchangeRule).append(itemMetaDiversionAttempts).append(storeName).append(itemMetaDeliveredBy).append(codamount).append(exchangeCode).append(cancelledAt).append(itemMetaSellerAcpOrRejBy).append(orderStatus).append(fulfilledStoreId).append(itemMetaDeliveryPartSelectByTime).append(itemCodAmount).append(bundledWarrantyAmount).append(exchangeDis).append(shipmentCreatedAt).append(shipmentType).append(itemMetaDeliveryPartCancelledBy).append(itemDiscountedPrice).append(itemWalletDiscount).append(fulfilledItemGross).append(itemMetaEditDeliveryModeByTimestamp).append(orderItemGross).append(isCancelledUser).append(orderSummaryLat).append(retailerStatus).append(totalAmount).append(productTitle).append(orderSummaryPg).append(itemMetaDeliveryPartCancelledByTime).append(storeLocality).append(productId).append(createdAt).append(itemMetaDeliveryPartSelectBy).append(offerDescription).append(retailerStatusLastUpdated).append(isCancelledSales).append(onlineAmount).append(paymentType).append(shipmentShipmentId).append(itemMetaDivertedReason).append(shipmentOutForDeliveryTimestamp).append(quantity).append(bundledWarrantySalesStatus).append(orderStatusModifiedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return new EqualsBuilder().append(comment, rhs.comment).append(orderSummaryComment, rhs.orderSummaryComment).append(bundledWarrantyDuration, rhs.bundledWarrantyDuration).append(itemOnlineAmount, rhs.itemOnlineAmount).append(storeId, rhs.storeId).append(isRetailerCancelled, rhs.isRetailerCancelled).append(orderItemDiscount, rhs.orderItemDiscount).append(itemMetaSellerDivertedByTime, rhs.itemMetaSellerDivertedByTime).append(itemMetaEditDeliveryModeBy, rhs.itemMetaEditDeliveryModeBy).append(shipmentDeliveryTimestamp, rhs.shipmentDeliveryTimestamp).append(orderSummaryLng, rhs.orderSummaryLng).append(itemMetaSellerDivertedBy, rhs.itemMetaSellerDivertedBy).append(couponDiscount, rhs.couponDiscount).append(shippingCharges, rhs.shippingCharges).append(itemMetaOfdBy, rhs.itemMetaOfdBy).append(retailerAcceptanceTime, rhs.retailerAcceptanceTime).append(itemMetaCancellationDoneBy, rhs.itemMetaCancellationDoneBy).append(itemMetaShipmentGenBy, rhs.itemMetaShipmentGenBy).append(orderItemTotal, rhs.orderItemTotal).append(exchangeDiscount, rhs.exchangeDiscount).append(id, rhs.id).append(cancelReason, rhs.cancelReason).append(hasWarranty, rhs.hasWarranty).append(isExchangeApplied, rhs.isExchangeApplied).append(shipmentShipmentStatus, rhs.shipmentShipmentStatus).append(orderSummaryCodAmount, rhs.orderSummaryCodAmount).append(shipmentDeliveryPartnerName, rhs.shipmentDeliveryPartnerName).append(cancellationReason, rhs.cancellationReason).append(unitPrice, rhs.unitPrice).append(exchangeRule, rhs.exchangeRule).append(itemMetaDiversionAttempts, rhs.itemMetaDiversionAttempts).append(storeName, rhs.storeName).append(itemMetaDeliveredBy, rhs.itemMetaDeliveredBy).append(codamount, rhs.codamount).append(exchangeCode, rhs.exchangeCode).append(cancelledAt, rhs.cancelledAt).append(itemMetaSellerAcpOrRejBy, rhs.itemMetaSellerAcpOrRejBy).append(orderStatus, rhs.orderStatus).append(fulfilledStoreId, rhs.fulfilledStoreId).append(itemMetaDeliveryPartSelectByTime, rhs.itemMetaDeliveryPartSelectByTime).append(itemCodAmount, rhs.itemCodAmount).append(bundledWarrantyAmount, rhs.bundledWarrantyAmount).append(exchangeDis, rhs.exchangeDis).append(shipmentCreatedAt, rhs.shipmentCreatedAt).append(shipmentType, rhs.shipmentType).append(itemMetaDeliveryPartCancelledBy, rhs.itemMetaDeliveryPartCancelledBy).append(itemDiscountedPrice, rhs.itemDiscountedPrice).append(itemWalletDiscount, rhs.itemWalletDiscount).append(fulfilledItemGross, rhs.fulfilledItemGross).append(itemMetaEditDeliveryModeByTimestamp, rhs.itemMetaEditDeliveryModeByTimestamp).append(orderItemGross, rhs.orderItemGross).append(isCancelledUser, rhs.isCancelledUser).append(orderSummaryLat, rhs.orderSummaryLat).append(retailerStatus, rhs.retailerStatus).append(totalAmount, rhs.totalAmount).append(productTitle, rhs.productTitle).append(orderSummaryPg, rhs.orderSummaryPg).append(itemMetaDeliveryPartCancelledByTime, rhs.itemMetaDeliveryPartCancelledByTime).append(storeLocality, rhs.storeLocality).append(productId, rhs.productId).append(createdAt, rhs.createdAt).append(itemMetaDeliveryPartSelectBy, rhs.itemMetaDeliveryPartSelectBy).append(offerDescription, rhs.offerDescription).append(retailerStatusLastUpdated, rhs.retailerStatusLastUpdated).append(isCancelledSales, rhs.isCancelledSales).append(onlineAmount, rhs.onlineAmount).append(paymentType, rhs.paymentType).append(shipmentShipmentId, rhs.shipmentShipmentId).append(itemMetaDivertedReason, rhs.itemMetaDivertedReason).append(shipmentOutForDeliveryTimestamp, rhs.shipmentOutForDeliveryTimestamp).append(quantity, rhs.quantity).append(bundledWarrantySalesStatus, rhs.bundledWarrantySalesStatus).append(orderStatusModifiedAt, rhs.orderStatusModifiedAt).isEquals();
    }

}
