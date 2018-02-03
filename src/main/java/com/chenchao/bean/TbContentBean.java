package com.chenchao.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by T005 on 2018/2/3.
 */
@Entity
@Table(name = "tb_content", schema = "taotao", catalog = "")
public class TbContentBean {
    private long id;
    private long categoryId;
    private String title;
    private String subTitle;
    private String titleDesc;
    private String url;
    private String pic;
    private String pic2;
    private String content;
    @JsonFormat(timezone = "GMT + 8")
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
    @Column(name = "category_id", nullable = false)
    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 200)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "sub_title", nullable = true, length = 100)
    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Basic
    @Column(name = "title_desc", nullable = true, length = 500)
    public String getTitleDesc() {
        return titleDesc;
    }

    public void setTitleDesc(String titleDesc) {
        this.titleDesc = titleDesc;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 500)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "pic", nullable = true, length = 300)
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "pic2", nullable = true, length = 300)
    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

        TbContentBean that = (TbContentBean) o;

        if (id != that.id) return false;
        if (categoryId != that.categoryId) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (subTitle != null ? !subTitle.equals(that.subTitle) : that.subTitle != null) return false;
        if (titleDesc != null ? !titleDesc.equals(that.titleDesc) : that.titleDesc != null) return false;
        if (url != null ? !url.equals(that.url) : that.url != null) return false;
        if (pic != null ? !pic.equals(that.pic) : that.pic != null) return false;
        if (pic2 != null ? !pic2.equals(that.pic2) : that.pic2 != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (categoryId ^ (categoryId >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (subTitle != null ? subTitle.hashCode() : 0);
        result = 31 * result + (titleDesc != null ? titleDesc.hashCode() : 0);
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (pic != null ? pic.hashCode() : 0);
        result = 31 * result + (pic2 != null ? pic2.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
