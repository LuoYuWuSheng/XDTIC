package com.mvc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by xd on 2016/2/20.
 */
public class TDiscussPK implements Serializable {
    private int discussid;
    private int projectid;

    @Column(name = "discussid")
    @Id
    public int getDiscussid() {
        return discussid;
    }

    public void setDiscussid(int discussid) {
        this.discussid = discussid;
    }

    @Column(name = "projectid")
    @Id
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDiscussPK that = (TDiscussPK) o;

        if (discussid != that.discussid) return false;
        if (projectid != that.projectid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = discussid;
        result = 31 * result + projectid;
        return result;
    }
}
