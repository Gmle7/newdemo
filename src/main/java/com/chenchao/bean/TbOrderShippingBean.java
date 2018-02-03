package com.chenchao.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by T005 on 2018/2/3.
 */
@Entity
@Table(name = "tb_order_shipping", schema = "taotao", catalog = "")
public class TbOrderShippingBean {
    private String orderId;
    private String receiverName;
    private String receiverPhone;
    private String receiverMobile;
    private String receiverState;
    private String receiverCity;
    private String receiverDistrict;
    private String receiverAddress;
    private String receiverZip;
    private Timestamp created;
    private Timestamp updated;

    @Id
    @Column(name = "order_id", nullable = false, length = 50)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "receiver_name", nullable = true, length = 20)
    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    @Basic
    @Column(name = "receiver_phone", nullable = true, length = 20)
    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    @Basic
    @Column(name = "receiver_mobile", nullable = true, length = 30)
    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    @Basic
    @Column(name = "receiver_state", nullable = true, length = 10)
    public String getReceiverState() {
        return receiverState;
    }

    public void setReceiverState(String receiverState) {
        this.receiverState = receiverState;
    }

    @Basic
    @Column(name = "receiver_city", nullable = true, length = 10)
    public String getReceiverCity() {
        return receiverCity;
    }

    public void setReceiverCity(String receiverCity) {
        this.receiverCity = receiverCity;
    }

    @Basic
    @Column(name = "receiver_district", nullable = true, length = 20)
    public String getReceiverDistrict() {
        return receiverDistrict;
    }

    public void setReceiverDistrict(String receiverDistrict) {
        this.receiverDistrict = receiverDistrict;
    }

    @Basic
    @Column(name = "receiver_address", nullable = true, length = 200)
    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    @Basic
    @Column(name = "receiver_zip", nullable = true, length = 6)
    public String getReceiverZip() {
        return receiverZip;
    }

    public void setReceiverZip(String receiverZip) {
        this.receiverZip = receiverZip;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    @Basic
    @Column(name = "updated", nullable = true)
    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbOrderShippingBean that = (TbOrderShippingBean) o;

        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (receiverName != null ? !receiverName.equals(that.receiverName) : that.receiverName != null) return false;
        if (receiverPhone != null ? !receiverPhone.equals(that.receiverPhone) : that.receiverPhone != null)
            return false;
        if (receiverMobile != null ? !receiverMobile.equals(that.receiverMobile) : that.receiverMobile != null)
            return false;
        if (receiverState != null ? !receiverState.equals(that.receiverState) : that.receiverState != null)
            return false;
        if (receiverCity != null ? !receiverCity.equals(that.receiverCity) : that.receiverCity != null) return false;
        if (receiverDistrict != null ? !receiverDistrict.equals(that.receiverDistrict) : that.receiverDistrict != null)
            return false;
        if (receiverAddress != null ? !receiverAddress.equals(that.receiverAddress) : that.receiverAddress != null)
            return false;
        if (receiverZip != null ? !receiverZip.equals(that.receiverZip) : that.receiverZip != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderId != null ? orderId.hashCode() : 0;
        result = 31 * result + (receiverName != null ? receiverName.hashCode() : 0);
        result = 31 * result + (receiverPhone != null ? receiverPhone.hashCode() : 0);
        result = 31 * result + (receiverMobile != null ? receiverMobile.hashCode() : 0);
        result = 31 * result + (receiverState != null ? receiverState.hashCode() : 0);
        result = 31 * result + (receiverCity != null ? receiverCity.hashCode() : 0);
        result = 31 * result + (receiverDistrict != null ? receiverDistrict.hashCode() : 0);
        result = 31 * result + (receiverAddress != null ? receiverAddress.hashCode() : 0);
        result = 31 * result + (receiverZip != null ? receiverZip.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
