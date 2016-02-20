package com.mvc.model;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_user", schema = "", catalog = "xdtdclubdb")
public class TUser {
    private Integer userid;
    private String username;
    private byte[] picturename;
    private String password;
    private Integer apartmentid;
    private Integer schoolid;
    private String telchone;
    private String email;
    private String skill;

    @Id
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "picturename")
    public byte[] getPicturename() {
        return picturename;
    }

    public void setPicturename(byte[] picturename) {
        this.picturename = picturename;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "apartmentid")
    public Integer getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(Integer apartmentid) {
        this.apartmentid = apartmentid;
    }

    @Basic
    @Column(name = "schoolid")
    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    @Basic
    @Column(name = "telchone")
    public String getTelchone() {
        return telchone;
    }

    public void setTelchone(String telchone) {
        this.telchone = telchone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "skill")
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUser tUser = (TUser) o;

        if (apartmentid != null ? !apartmentid.equals(tUser.apartmentid) : tUser.apartmentid != null) return false;
        if (email != null ? !email.equals(tUser.email) : tUser.email != null) return false;
        if (password != null ? !password.equals(tUser.password) : tUser.password != null) return false;
        if (!Arrays.equals(picturename, tUser.picturename)) return false;
        if (schoolid != null ? !schoolid.equals(tUser.schoolid) : tUser.schoolid != null) return false;
        if (skill != null ? !skill.equals(tUser.skill) : tUser.skill != null) return false;
        if (telchone != null ? !telchone.equals(tUser.telchone) : tUser.telchone != null) return false;
        if (userid != null ? !userid.equals(tUser.userid) : tUser.userid != null) return false;
        if (username != null ? !username.equals(tUser.username) : tUser.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userid != null ? userid.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (picturename != null ? Arrays.hashCode(picturename) : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (apartmentid != null ? apartmentid.hashCode() : 0);
        result = 31 * result + (schoolid != null ? schoolid.hashCode() : 0);
        result = 31 * result + (telchone != null ? telchone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (skill != null ? skill.hashCode() : 0);
        return result;
    }
}
