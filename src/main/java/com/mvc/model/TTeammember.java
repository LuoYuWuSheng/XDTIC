package com.mvc.model;

import javax.persistence.*;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_teammember", schema = "", catalog = "xdtdclubdb")
@IdClass(TTeammemberPK.class)
public class TTeammember {
    private int id;
    private int userid;
    private String username;
    private Integer teamid;
    private String membertype;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "userid")
    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
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
    @Column(name = "teamid")
    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    @Basic
    @Column(name = "membertype")
    public String getMembertype() {
        return membertype;
    }

    public void setMembertype(String membertype) {
        this.membertype = membertype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeammember that = (TTeammember) o;

        if (id != that.id) return false;
        if (userid != that.userid) return false;
        if (membertype != null ? !membertype.equals(that.membertype) : that.membertype != null) return false;
        if (teamid != null ? !teamid.equals(that.teamid) : that.teamid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + userid;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (teamid != null ? teamid.hashCode() : 0);
        result = 31 * result + (membertype != null ? membertype.hashCode() : 0);
        return result;
    }
}
