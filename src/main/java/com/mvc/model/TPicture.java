package com.mvc.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_picture", schema = "", catalog = "xdtdclubdb")
public class TPicture {
    private Integer pictureid;
    private String picturename;
    private int belongstoid;
    private byte[] belongstotype;

    @Basic
    @Column(name = "pictureid")
    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    @Basic
    @Column(name = "picturename")
    public String getPicturename() {
        return picturename;
    }

    public void setPicturename(String picturename) {
        this.picturename = picturename;
    }

    @Id
    @Column(name = "belongstoid")
    public int getBelongstoid() {
        return belongstoid;
    }

    public void setBelongstoid(int belongstoid) {
        this.belongstoid = belongstoid;
    }

    @Basic
    @Column(name = "belongstotype")
    public byte[] getBelongstotype() {
        return belongstotype;
    }

    public void setBelongstotype(byte[] belongstotype) {
        this.belongstotype = belongstotype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TPicture tPicture = (TPicture) o;

        if (belongstoid != tPicture.belongstoid) return false;
        if (!Arrays.equals(belongstotype, tPicture.belongstotype)) return false;
        if (pictureid != null ? !pictureid.equals(tPicture.pictureid) : tPicture.pictureid != null) return false;
        if (picturename != null ? !picturename.equals(tPicture.picturename) : tPicture.picturename != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pictureid != null ? pictureid.hashCode() : 0;
        result = 31 * result + (picturename != null ? picturename.hashCode() : 0);
        result = 31 * result + belongstoid;
        result = 31 * result + (belongstotype != null ? Arrays.hashCode(belongstotype) : 0);
        return result;
    }
}
