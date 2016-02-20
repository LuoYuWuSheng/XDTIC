package com.mvc.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_team", schema = "", catalog = "xdtdclubdb")
public class TTeam {
    private Integer teamid;
    private String teamname;
    private Integer projectid;
    private Date createtime;
    private String wantinfo;
    private String iswant;

    @Id
    @Column(name = "teamid")
    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
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
    @Column(name = "iswant")
    public String getIswant() {
        return iswant;
    }

    public void setIswant(String iswant) {
        this.iswant = iswant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTeam tTeam = (TTeam) o;

        if (createtime != null ? !createtime.equals(tTeam.createtime) : tTeam.createtime != null) return false;
        if (iswant != null ? !iswant.equals(tTeam.iswant) : tTeam.iswant != null) return false;
        if (projectid != null ? !projectid.equals(tTeam.projectid) : tTeam.projectid != null) return false;
        if (teamid != null ? !teamid.equals(tTeam.teamid) : tTeam.teamid != null) return false;
        if (teamname != null ? !teamname.equals(tTeam.teamname) : tTeam.teamname != null) return false;
        if (wantinfo != null ? !wantinfo.equals(tTeam.wantinfo) : tTeam.wantinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teamid != null ? teamid.hashCode() : 0;
        result = 31 * result + (teamname != null ? teamname.hashCode() : 0);
        result = 31 * result + (projectid != null ? projectid.hashCode() : 0);
        result = 31 * result + (createtime != null ? createtime.hashCode() : 0);
        result = 31 * result + (wantinfo != null ? wantinfo.hashCode() : 0);
        result = 31 * result + (iswant != null ? iswant.hashCode() : 0);
        return result;
    }
}
