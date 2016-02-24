package com.user;

/**
 * Created by luoyu on 2016/2/10 0010.
 */

import com.mvc.model.TUser;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户抽象类
 */
public abstract class AbstractUser {

    //用户信息表的hibernate实例
    private TUser userinfo = null;

    public AbstractUser(TUser userinfo) {
        this.userinfo = userinfo;
    }
    //编辑用户信息。
    public boolean editInfo(){
        return true;
    }
    //保存用户信息，如果成功，则返回true，否则false
    public boolean saveInfo(HttpServletRequest request){

        return true;
    }
}
