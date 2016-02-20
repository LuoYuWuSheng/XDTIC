package com.mvc.model;

import javax.persistence.*;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_school", schema = "", catalog = "xdtdclubdb")
public class TSchool {
    private Integer schoolid;
    private String schoolname;

    @Id
    @Column(name = "schoolid")
    public Integer getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    @Basic
    @Column(name = "schoolname")
    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TSchool tSchool = (TSchool) o;

        if (schoolid != null ? !schoolid.equals(tSchool.schoolid) : tSchool.schoolid != null) return false;
        if (schoolname != null ? !schoolname.equals(tSchool.schoolname) : tSchool.schoolname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = schoolid != null ? schoolid.hashCode() : 0;
        result = 31 * result + (schoolname != null ? schoolname.hashCode() : 0);
        return result;
    }
}
