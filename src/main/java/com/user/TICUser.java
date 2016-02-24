package com.user;

import com.mvc.model.TUser;

/**
 * Created by xd on 2016/2/19.
 * 俱乐部成员
 * 配置成hibernate的一张表
 * 对应数据库的内部用户表
 */
public class TICUser extends AbstractUser {
    //为了方便编程，暂时将这些属性设置成public 但这样做不好。
    public String ID;
    public String name;
    public String password;
    public String PhotoId;
    public String sex;
    //部门这个，按照陈苗的数据库设计恐怕得需要一个外键
    public String Department;
    public String PhoneNumber;
    public String college;
    public String email;
    //特长
    public String speciality;

    public TICUser(TUser tUser) {
        super(tUser);
    }
}
