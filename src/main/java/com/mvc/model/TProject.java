package com.mvc.model;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by xd on 2016/2/20.
 */
@Entity
@Table(name = "t_project", schema = "", catalog = "xdtdclubdb")
public class TProject {
    private int projectid;
    private String projectname;
    private String projecttopersonname;
    private String projecttoemail;
    private String projecttotel;
    private String projectintroduction;
    private Integer userid;
    private Date projectreleasetime;
    private Byte projectstatue;

    @Id
    @Column(name = "projectid")
    public int getProjectid() {
        return projectid;
    }

    public void setProjectid(int projectid) {
        this.projectid = projectid;
    }

    @Basic
    @Column(name = "projectname")
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    @Basic
    @Column(name = "projecttopersonname")
    public String getProjecttopersonname() {
        return projecttopersonname;
    }

    public void setProjecttopersonname(String projecttopersonname) {
        this.projecttopersonname = projecttopersonname;
    }

    @Basic
    @Column(name = "projecttoemail")
    public String getProjecttoemail() {
        return projecttoemail;
    }

    public void setProjecttoemail(String projecttoemail) {
        this.projecttoemail = projecttoemail;
    }

    @Basic
    @Column(name = "projecttotel")
    public String getProjecttotel() {
        return projecttotel;
    }

    public void setProjecttotel(String projecttotel) {
        this.projecttotel = projecttotel;
    }

    @Basic
    @Column(name = "projectintroduction")
    public String getProjectintroduction() {
        return projectintroduction;
    }

    public void setProjectintroduction(String projectintroduction) {
        this.projectintroduction = projectintroduction;
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
    @Column(name = "projectreleasetime")
    public Date getProjectreleasetime() {
        return projectreleasetime;
    }

    public void setProjectreleasetime(Date projectreleasetime) {
        this.projectreleasetime = projectreleasetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TProject tProject = (TProject) o;

        if (projectid != tProject.projectid) return false;
        if (projectintroduction != null ? !projectintroduction.equals(tProject.projectintroduction) : tProject.projectintroduction != null)
            return false;
        if (projectname != null ? !projectname.equals(tProject.projectname) : tProject.projectname != null)
            return false;
        if (projectreleasetime != null ? !projectreleasetime.equals(tProject.projectreleasetime) : tProject.projectreleasetime != null)
            return false;
        if (projecttoemail != null ? !projecttoemail.equals(tProject.projecttoemail) : tProject.projecttoemail != null)
            return false;
        if (projecttopersonname != null ? !projecttopersonname.equals(tProject.projecttopersonname) : tProject.projecttopersonname != null)
            return false;
        if (projecttotel != null ? !projecttotel.equals(tProject.projecttotel) : tProject.projecttotel != null)
            return false;
        if (userid != null ? !userid.equals(tProject.userid) : tProject.userid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = projectid;
        result = 31 * result + (projectname != null ? projectname.hashCode() : 0);
        result = 31 * result + (projecttopersonname != null ? projecttopersonname.hashCode() : 0);
        result = 31 * result + (projecttoemail != null ? projecttoemail.hashCode() : 0);
        result = 31 * result + (projecttotel != null ? projecttotel.hashCode() : 0);
        result = 31 * result + (projectintroduction != null ? projectintroduction.hashCode() : 0);
        result = 31 * result + (userid != null ? userid.hashCode() : 0);
        result = 31 * result + (projectreleasetime != null ? projectreleasetime.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "projectstatue")
    public Byte getProjectstatue() {
        return projectstatue;
    }

    public void setProjectstatue(Byte projectstatue) {
        this.projectstatue = projectstatue;
    }
}
