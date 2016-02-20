package com.mvc.model;

import javax.persistence.*;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_apartment", schema = "", catalog = "xdtdclubdb")
public class TApartment {
    private Integer apartmentid;
    private String apartmentname;

    @Id
    @Column(name = "apartmentid")
    public Integer getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(Integer apartmentid) {
        this.apartmentid = apartmentid;
    }

    @Basic
    @Column(name = "apartmentname")
    public String getApartmentname() {
        return apartmentname;
    }

    public void setApartmentname(String apartmentname) {
        this.apartmentname = apartmentname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TApartment that = (TApartment) o;

        if (apartmentid != null ? !apartmentid.equals(that.apartmentid) : that.apartmentid != null) return false;
        if (apartmentname != null ? !apartmentname.equals(that.apartmentname) : that.apartmentname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apartmentid != null ? apartmentid.hashCode() : 0;
        result = 31 * result + (apartmentname != null ? apartmentname.hashCode() : 0);
        return result;
    }
}
