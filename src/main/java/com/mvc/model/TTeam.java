package com.mvc.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xd on 2016/3/27.
 */
@Entity
@Table(name = "t_team", schema = "", catalog = "xdtdclubdb")
public class TTeam {
    private int teamid;
    private String teamname;
    private Integer projectid;
    private Date createtime;
    private String wantinfo;
    private String username;
    private Integer userid;
    private String teammember;
    private Byte iswant;

    @Id
    @Column(name = "teamid")
    public int getTeamid() {
        return teamid;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    @Basic
    @Column(name = "teamname")
    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    @Basic
    @Column(name = "projectid")
    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    @Basic
    @Column(name = "createtime")
    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Basic
    @Column(name = "wantinfo")
    public String getWantinfo() {
        return wantinfo;
    }

    public void setWantinfo(String wantinfo) {
        this.wantinfo = wantinfo;
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
    @Column(name = "userid")
    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Basic
    @Column(name = "teammember")
    public String getTeammember() {
        return teammember;
    }

    public void setTeammember(String teammember) {
        this.teammember = teammember;
    }

    @Basic
    @Column(name = "iswant")
    public Byte getIswant() {
        return iswant;
    }

    public void setIswant(Byte iswant) {
        this.iswant = iswant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeam team = (TTeam) o;

        if (teamid != team.teamid) return false;
        if (createtime != null ? !createtime.equals(team.createtime) : team.createtime != null) return false;
        if (iswant != null ? !iswant.equals(team.iswant) : team.iswant != null) return false;
        if (projectid != null ? !projectid.equals(team.projectid) : team.projectid != null) return false;
        if (teammember != null ? !teammember.equals(team.teammember) : team.teammember != null) return false;
        if (teamname != null ? !teamname.equals(team.teamname) : team.teamname != null) return false;
        if (userid != null ? !userid.equals(team.userid) : team.userid != null) return false;
        if (username != null ? !username.equals(team.username) : team.username != null) return false;
        if (wantinfo != null ? !wantinfo.equals(team.wantinfo) : team.wantinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamid;
        result = 31 * result + (teamname != null ? teamname.hashCode() : 0);
        result = 31 * result + (projectid != null ? projectid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (wantinfo != null ? wantinfo.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (teammember != null ? teammember.hashCode() : 0);
        result = 31 * result + (iswant != null ? iswant.hashCode() : 0);
        return result;
    }
}
