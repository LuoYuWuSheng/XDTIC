package com.mvc.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_discuss", schema = "", catalog = "xdtdclubdb")
@IdClass(TDiscussPK.class)
public class TDiscuss {
    private int discussid;
    private int projectid;
    private Integer userid;
    private String username;
    private String discusscontent;
    private String issupport;
    private Date discusstime;

    @Id
    @Column(name = "discussid")
    public int getDiscussid() {
        return discussid;
    }

    public void setDiscussid(int discussid) {
        this.discussid = discussid;
    }

    @Id
    @Column(name = "projectid")
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Basic
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
    @Column(name = "discusscontent")
    public String getDiscusscontent() {
        return discusscontent;
    }

    public void setDiscusscontent(String discusscontent) {
        this.discusscontent = discusscontent;
    }

    @Basic
    @Column(name = "issupport")
    public String getIssupport() {
        return issupport;
    }

    public void setIssupport(String issupport) {
        this.issupport = issupport;
    }

    @Basic
    @Column(name = "discusstime")
    public Date getDiscusstime() {
        return discusstime;
    }

    public void setDiscusstime(Date discusstime) {
        this.discusstime = discusstime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDiscuss tDiscuss = (TDiscuss) o;

        if (discussid != tDiscuss.discussid) return false;
        if (projectid != tDiscuss.projectid) return false;
        if (discusscontent != null ? !discusscontent.equals(tDiscuss.discusscontent) : tDiscuss.discusscontent != null)
            return false;
        if (discusstime != null ? !discusstime.equals(tDiscuss.discusstime) : tDiscuss.discusstime != null)
            return false;
        if (issupport != null ? !issupport.equals(tDiscuss.issupport) : tDiscuss.issupport != null) return false;
        if (userid != null ? !userid.equals(tDiscuss.userid) : tDiscuss.userid != null) return false;
        if (username != null ? !username.equals(tDiscuss.username) : tDiscuss.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = discussid;
        result = 31 * result + projectid;
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (discusscontent != null ? discusscontent.hashCode() : 0);
        result = 31 * result + (issupport != null ? issupport.hashCode() : 0);
        result = 31 * result + (discusstime != null ? discusstime.hashCode() : 0);
        return result;
    }
}
