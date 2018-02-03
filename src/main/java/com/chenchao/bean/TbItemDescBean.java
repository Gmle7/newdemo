package com.chenchao.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by T005 on 2018/2/3.
 */
@Entity
@Table(name = "tb_item_desc", schema = "taotao", catalog = "")
public class TbItemDescBean {
    private long itemId;
    private String itemDesc;
    private Timestamp created;
    private Timestamp updated;

    @Id
    @Column(name = "item_id", nullable = false)
    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    @Basic
    @Column(name = "item_desc", nullable = true, length = -1)
    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
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

        TbItemDescBean that = (TbItemDescBean) o;

        if (itemId != that.itemId) return false;
        if (itemDesc != null ? !itemDesc.equals(that.itemDesc) : that.itemDesc != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (itemId ^ (itemId >>> 32));
        result = 31 * result + (itemDesc != null ? itemDesc.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
