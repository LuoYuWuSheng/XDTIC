package com.user;

import com.mvc.model.TUser;
import com.project.ProjectProxy;

import javax.inject.Inject;

/**
 * Created by xd on 2016/2/19.
 * 俱乐部成员
 * 配置成hibernate的一张表
 * 对应数据库的内部用户表
 */
public class TICUser extends AbstractUser {

    private ProjectProxy proxy;
    public TICUser(TUser tUser,ProjectProxy proxy)
    {
        super(tUser);
        this.proxy = proxy;
    }
}
