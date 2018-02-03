package com.chenchao.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by T005 on 2018/2/3.
 */
@Entity
@Table(name = "tb_order", schema = "taotao", catalog = "")
public class TbOrderBean {
    private String orderId;
    private String payment;
    private Integer paymentType;
    private String postFee;
    private Integer status;
    private Timestamp createTime;
    private Timestamp updateTime;
    private Timestamp paymentTime;
    private Timestamp consignTime;
    private Timestamp endTime;
    private Timestamp closeTime;
    private String shippingName;
    private String shippingCode;
    private Long userId;
    private String buyerMessage;
    private String buyerNick;
    private Integer buyerRate;

    @Id
    @Column(name = "order_id", nullable = false, length = 50)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "payment", nullable = true, length = 50)
    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Basic
    @Column(name = "payment_type", nullable = true)
    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    @Basic
    @Column(name = "post_fee", nullable = true, length = 50)
    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "payment_time", nullable = true)
    public Timestamp getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Timestamp paymentTime) {
        this.paymentTime = paymentTime;
    }

    @Basic
    @Column(name = "consign_time", nullable = true)
    public Timestamp getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Timestamp consignTime) {
        this.consignTime = consignTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true)
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "close_time", nullable = true)
    public Timestamp getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Timestamp closeTime) {
        this.closeTime = closeTime;
    }

    @Basic
    @Column(name = "shipping_name", nullable = true, length = 20)
    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    @Basic
    @Column(name = "shipping_code", nullable = true, length = 20)
    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "buyer_message", nullable = true, length = 100)
    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    @Basic
    @Column(name = "buyer_nick", nullable = true, length = 50)
    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    @Basic
    @Column(name = "buyer_rate", nullable = true)
    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOrderBean that = (TbOrderBean) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (payment != null ? !payment.equals(that.payment) : that.payment != null) return false;
        if (paymentType != null ? !paymentType.equals(that.paymentType) : that.paymentType != null) return false;
        if (postFee != null ? !postFee.equals(that.postFee) : that.postFee != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (paymentTime != null ? !paymentTime.equals(that.paymentTime) : that.paymentTime != null) return false;
        if (consignTime != null ? !consignTime.equals(that.consignTime) : that.consignTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (closeTime != null ? !closeTime.equals(that.closeTime) : that.closeTime != null) return false;
        if (shippingName != null ? !shippingName.equals(that.shippingName) : that.shippingName != null) return false;
        if (shippingCode != null ? !shippingCode.equals(that.shippingCode) : that.shippingCode != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (buyerMessage != null ? !buyerMessage.equals(that.buyerMessage) : that.buyerMessage != null) return false;
        if (buyerNick != null ? !buyerNick.equals(that.buyerNick) : that.buyerNick != null) return false;
        if (buyerRate != null ? !buyerRate.equals(that.buyerRate) : that.buyerRate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (payment != null ? payment.hashCode() : 0);
        result = 31 * result + (paymentType != null ? paymentType.hashCode() : 0);
        result = 31 * result + (postFee != null ? postFee.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (paymentTime != null ? paymentTime.hashCode() : 0);
        result = 31 * result + (consignTime != null ? consignTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        result = 31 * result + (shippingName != null ? shippingName.hashCode() : 0);
        result = 31 * result + (shippingCode != null ? shippingCode.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (buyerMessage != null ? buyerMessage.hashCode() : 0);
        result = 31 * result + (buyerNick != null ? buyerNick.hashCode() : 0);
        result = 31 * result + (buyerRate != null ? buyerRate.hashCode() : 0);
        return result;
    }
}
