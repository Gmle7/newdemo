package com.chenchao.bean;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by T005 on 2018/2/3.
 */
@Entity
@Table(name = "tb_content_category", schema = "taotao", catalog = "")
public class TbContentCategoryBean {
    private long id;
    private Long parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Byte isParent;
    private Timestamp created;
    private Timestamp updated;

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "sort_order", nullable = true)
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Basic
    @Column(name = "is_parent", nullable = true)
    public Byte getIsParent() {
        return isParent;
    }

    public void setIsParent(Byte isParent) {
        this.isParent = isParent;
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

        TbContentCategoryBean that = (TbContentCategoryBean) o;

        if (id != that.id) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (sortOrder != null ? !sortOrder.equals(that.sortOrder) : that.sortOrder != null) return false;
        if (isParent != null ? !isParent.equals(that.isParent) : that.isParent != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sortOrder != null ? sortOrder.hashCode() : 0);
        result = 31 * result + (isParent != null ? isParent.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
