
package com.journaldev.spring.pojo;

import java.util.ArrayList;
import java.util.List;

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
    "payment_failed",
    "is_cod",
    "payment_status",
    "fuzzy_resolved_by_timestamp",
    "pincode",
    "is_manual_intervention_required",
    "registered_email",
    "recipient_email",
    "lng",
    "region_id",
    "city",
    "user_id",
    "order_type",
    "is_confirmed",
    "customer_order_status",
    "wallet_discount",
    "fuzzy_resolved_by",
    "state",
    "pg",
    "order_cnf_or_rej_by_time",
    "order_id",
    "recipient_name",
    "contact_no",
    "order_cnf_or_rej_by",
    "address",
    "lat",
    "customer_acceptance_time",
    "items",
    "created_at",
    "coupon_code",
    "payment_type"
})
public class OrderData {

    @JsonProperty("payment_failed")
    private boolean paymentFailed;
    @JsonProperty("is_cod")
    private boolean isCod;
    @JsonProperty("payment_status")
    private String paymentStatus;
    @JsonProperty("fuzzy_resolved_by_timestamp")
    private String fuzzyResolvedByTimestamp;
    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("is_manual_intervention_required")
    private String isManualInterventionRequired;
    @JsonProperty("registered_email")
    private String registeredEmail;
    @JsonProperty("recipient_email")
    private String recipientEmail;
    @JsonProperty("lng")
    private double lng;
    @JsonProperty("region_id")
    private long regionId;
    @JsonProperty("city")
    private String city;
    @JsonProperty("user_id")
    private long userId;
    @JsonProperty("order_type")
    private long orderType;
    @JsonProperty("is_confirmed")
    private boolean isConfirmed;
    @JsonProperty("customer_order_status")
    private String customerOrderStatus;
    @JsonProperty("wallet_discount")
    private long walletDiscount;
    @JsonProperty("fuzzy_resolved_by")
    private String fuzzyResolvedBy;
    @JsonProperty("state")
    private String state;
    @JsonProperty("pg")
    private String pg;
    @JsonProperty("order_cnf_or_rej_by_time")
    private String orderCnfOrRejByTime;
    @JsonProperty("order_id")
    private long orderId;
    @JsonProperty("recipient_name")
    private String recipientName;
    @JsonProperty("contact_no")
    private String contactNo;
    @JsonProperty("order_cnf_or_rej_by")
    private String orderCnfOrRejBy;
    @JsonProperty("address")
    private String address;
    @JsonProperty("lat")
    private double lat;
    @JsonProperty("customer_acceptance_time")
    private String customerAcceptanceTime;
    @JsonProperty("items")
    private List<Item> items = new ArrayList<Item>();
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("coupon_code")
    private String couponCode;
    @JsonProperty("payment_type")
    private String paymentType;

    /**
     * 
     * @return
     *     The paymentFailed
     */
    @JsonProperty("payment_failed")
    public boolean isPaymentFailed() {
        return paymentFailed;
    }

    /**
     * 
     * @param paymentFailed
     *     The payment_failed
     */
    @JsonProperty("payment_failed")
    public void setPaymentFailed(boolean paymentFailed) {
        this.paymentFailed = paymentFailed;
    }

    /**
     * 
     * @return
     *     The isCod
     */
    @JsonProperty("is_cod")
    public boolean isIsCod() {
        return isCod;
    }

    /**
     * 
     * @param isCod
     *     The is_cod
     */
    @JsonProperty("is_cod")
    public void setIsCod(boolean isCod) {
        this.isCod = isCod;
    }

    /**
     * 
     * @return
     *     The paymentStatus
     */
    @JsonProperty("payment_status")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 
     * @param paymentStatus
     *     The payment_status
     */
    @JsonProperty("payment_status")
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * 
     * @return
     *     The fuzzyResolvedByTimestamp
     */
    @JsonProperty("fuzzy_resolved_by_timestamp")
    public Object getFuzzyResolvedByTimestamp() {
        return fuzzyResolvedByTimestamp;
    }

    /**
     * 
     * @param fuzzyResolvedByTimestamp
     *     The fuzzy_resolved_by_timestamp
     */
    @JsonProperty("fuzzy_resolved_by_timestamp")
    public void setFuzzyResolvedByTimestamp(String fuzzyResolvedByTimestamp) {
        this.fuzzyResolvedByTimestamp = fuzzyResolvedByTimestamp;
    }

    /**
     * 
     * @return
     *     The pincode
     */
    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    /**
     * 
     * @param pincode
     *     The pincode
     */
    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * 
     * @return
     *     The isManualInterventionRequired
     */
    @JsonProperty("is_manual_intervention_required")
    public Object getIsManualInterventionRequired() {
        return isManualInterventionRequired;
    }

    /**
     * 
     * @param isManualInterventionRequired
     *     The is_manual_intervention_required
     */
    @JsonProperty("is_manual_intervention_required")
    public void setIsManualInterventionRequired(String isManualInterventionRequired) {
        this.isManualInterventionRequired = isManualInterventionRequired;
    }

    /**
     * 
     * @return
     *     The registeredEmail
     */
    @JsonProperty("registered_email")
    public String getRegisteredEmail() {
        return registeredEmail;
    }

    /**
     * 
     * @param registeredEmail
     *     The registered_email
     */
    @JsonProperty("registered_email")
    public void setRegisteredEmail(String registeredEmail) {
        this.registeredEmail = registeredEmail;
    }

    /**
     * 
     * @return
     *     The recipientEmail
     */
    @JsonProperty("recipient_email")
    public String getRecipientEmail() {
        return recipientEmail;
    }

    /**
     * 
     * @param recipientEmail
     *     The recipient_email
     */
    @JsonProperty("recipient_email")
    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    /**
     * 
     * @return
     *     The lng
     */
    @JsonProperty("lng")
    public double getLng() {
        return lng;
    }

    /**
     * 
     * @param lng
     *     The lng
     */
    @JsonProperty("lng")
    public void setLng(double lng) {
        this.lng = lng;
    }

    /**
     * 
     * @return
     *     The regionId
     */
    @JsonProperty("region_id")
    public long getRegionId() {
        return regionId;
    }

    /**
     * 
     * @param regionId
     *     The region_id
     */
    @JsonProperty("region_id")
    public void setRegionId(long regionId) {
        this.regionId = regionId;
    }

    /**
     * 
     * @return
     *     The city
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * @param city
     *     The city
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 
     * @return
     *     The userId
     */
    @JsonProperty("user_id")
    public long getUserId() {
        return userId;
    }

    /**
     * 
     * @param userId
     *     The user_id
     */
    @JsonProperty("user_id")
    public void setUserId(long userId) {
        this.userId = userId;
    }

    /**
     * 
     * @return
     *     The orderType
     */
    @JsonProperty("order_type")
    public long getOrderType() {
        return orderType;
    }

    /**
     * 
     * @param orderType
     *     The order_type
     */
    @JsonProperty("order_type")
    public void setOrderType(long orderType) {
        this.orderType = orderType;
    }

    /**
     * 
     * @return
     *     The isConfirmed
     */
    @JsonProperty("is_confirmed")
    public boolean isIsConfirmed() {
        return isConfirmed;
    }

    /**
     * 
     * @param isConfirmed
     *     The is_confirmed
     */
    @JsonProperty("is_confirmed")
    public void setIsConfirmed(boolean isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    /**
     * 
     * @return
     *     The customerOrderStatus
     */
    @JsonProperty("customer_order_status")
    public String getCustomerOrderStatus() {
        return customerOrderStatus;
    }

    /**
     * 
     * @param customerOrderStatus
     *     The customer_order_status
     */
    @JsonProperty("customer_order_status")
    public void setCustomerOrderStatus(String customerOrderStatus) {
        this.customerOrderStatus = customerOrderStatus;
    }

    /**
     * 
     * @return
     *     The walletDiscount
     */
    @JsonProperty("wallet_discount")
    public long getWalletDiscount() {
        return walletDiscount;
    }

    /**
     * 
     * @param walletDiscount
     *     The wallet_discount
     */
    @JsonProperty("wallet_discount")
    public void setWalletDiscount(long walletDiscount) {
        this.walletDiscount = walletDiscount;
    }

    /**
     * 
     * @return
     *     The fuzzyResolvedBy
     */
    @JsonProperty("fuzzy_resolved_by")
    public Object getFuzzyResolvedBy() {
        return fuzzyResolvedBy;
    }

    /**
     * 
     * @param fuzzyResolvedBy
     *     The fuzzy_resolved_by
     */
    @JsonProperty("fuzzy_resolved_by")
    public void setFuzzyResolvedBy(String fuzzyResolvedBy) {
        this.fuzzyResolvedBy = fuzzyResolvedBy;
    }

    /**
     * 
     * @return
     *     The state
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * @param state
     *     The state
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 
     * @return
     *     The pg
     */
    @JsonProperty("pg")
    public String getPg() {
        return pg;
    }

    /**
     * 
     * @param pg
     *     The pg
     */
    @JsonProperty("pg")
    public void setPg(String pg) {
        this.pg = pg;
    }

    /**
     * 
     * @return
     *     The orderCnfOrRejByTime
     */
    @JsonProperty("order_cnf_or_rej_by_time")
    public String getOrderCnfOrRejByTime() {
        return orderCnfOrRejByTime;
    }

    /**
     * 
     * @param orderCnfOrRejByTime
     *     The order_cnf_or_rej_by_time
     */
    @JsonProperty("order_cnf_or_rej_by_time")
    public void setOrderCnfOrRejByTime(String orderCnfOrRejByTime) {
        this.orderCnfOrRejByTime = orderCnfOrRejByTime;
    }

    /**
     * 
     * @return
     *     The orderId
     */
    @JsonProperty("order_id")
    public long getOrderId() {
        return orderId;
    }

    /**
     * 
     * @param orderId
     *     The order_id
     */
    @JsonProperty("order_id")
    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    /**
     * 
     * @return
     *     The recipientName
     */
    @JsonProperty("recipient_name")
    public String getRecipientName() {
        return recipientName;
    }

    /**
     * 
     * @param recipientName
     *     The recipient_name
     */
    @JsonProperty("recipient_name")
    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    /**
     * 
     * @return
     *     The contactNo
     */
    @JsonProperty("contact_no")
    public String getContactNo() {
        return contactNo;
    }

    /**
     * 
     * @param contactNo
     *     The contact_no
     */
    @JsonProperty("contact_no")
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    /**
     * 
     * @return
     *     The orderCnfOrRejBy
     */
    @JsonProperty("order_cnf_or_rej_by")
    public String getOrderCnfOrRejBy() {
        return orderCnfOrRejBy;
    }

    /**
     * 
     * @param orderCnfOrRejBy
     *     The order_cnf_or_rej_by
     */
    @JsonProperty("order_cnf_or_rej_by")
    public void setOrderCnfOrRejBy(String orderCnfOrRejBy) {
        this.orderCnfOrRejBy = orderCnfOrRejBy;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The lat
     */
    @JsonProperty("lat")
    public double getLat() {
        return lat;
    }

    /**
     * 
     * @param lat
     *     The lat
     */
    @JsonProperty("lat")
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * 
     * @return
     *     The customerAcceptanceTime
     */
    @JsonProperty("customer_acceptance_time")
    public String getCustomerAcceptanceTime() {
        return customerAcceptanceTime;
    }

    /**
     * 
     * @param customerAcceptanceTime
     *     The customer_acceptance_time
     */
    @JsonProperty("customer_acceptance_time")
    public void setCustomerAcceptanceTime(String customerAcceptanceTime) {
        this.customerAcceptanceTime = customerAcceptanceTime;
    }

    /**
     * 
     * @return
     *     The items
     */
    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    /**
     * 
     * @param items
     *     The items
     */
    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
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
     *     The couponCode
     */
    @JsonProperty("coupon_code")
    public String getCouponCode() {
        return couponCode;
    }

    /**
     * 
     * @param couponCode
     *     The coupon_code
     */
    @JsonProperty("coupon_code")
    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(paymentFailed).append(isCod).append(paymentStatus).append(fuzzyResolvedByTimestamp).append(pincode).append(isManualInterventionRequired).append(registeredEmail).append(recipientEmail).append(lng).append(regionId).append(city).append(userId).append(orderType).append(isConfirmed).append(customerOrderStatus).append(walletDiscount).append(fuzzyResolvedBy).append(state).append(pg).append(orderCnfOrRejByTime).append(orderId).append(recipientName).append(contactNo).append(orderCnfOrRejBy).append(address).append(lat).append(customerAcceptanceTime).append(items).append(createdAt).append(couponCode).append(paymentType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderData) == false) {
            return false;
        }
        OrderData rhs = ((OrderData) other);
        return new EqualsBuilder().append(paymentFailed, rhs.paymentFailed).append(isCod, rhs.isCod).append(paymentStatus, rhs.paymentStatus).append(fuzzyResolvedByTimestamp, rhs.fuzzyResolvedByTimestamp).append(pincode, rhs.pincode).append(isManualInterventionRequired, rhs.isManualInterventionRequired).append(registeredEmail, rhs.registeredEmail).append(recipientEmail, rhs.recipientEmail).append(lng, rhs.lng).append(regionId, rhs.regionId).append(city, rhs.city).append(userId, rhs.userId).append(orderType, rhs.orderType).append(isConfirmed, rhs.isConfirmed).append(customerOrderStatus, rhs.customerOrderStatus).append(walletDiscount, rhs.walletDiscount).append(fuzzyResolvedBy, rhs.fuzzyResolvedBy).append(state, rhs.state).append(pg, rhs.pg).append(orderCnfOrRejByTime, rhs.orderCnfOrRejByTime).append(orderId, rhs.orderId).append(recipientName, rhs.recipientName).append(contactNo, rhs.contactNo).append(orderCnfOrRejBy, rhs.orderCnfOrRejBy).append(address, rhs.address).append(lat, rhs.lat).append(customerAcceptanceTime, rhs.customerAcceptanceTime).append(items, rhs.items).append(createdAt, rhs.createdAt).append(couponCode, rhs.couponCode).append(paymentType, rhs.paymentType).isEquals();
    }

}
