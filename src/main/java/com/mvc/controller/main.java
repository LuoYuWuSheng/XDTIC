package com.mvc.controller;

import Util.hibernateUtil;
import com.mvc.model.TUser;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;


/**
 * Created by xd on 2016/1/29.
 */
@Controller
@RequestMapping(value = "/")
public class main {

    //todo 1、hibernate配置文件路径的问题
    //todo 2、/main被调用了两次，不知原因


    @RequestMapping
    public String indext() {

//        Session session =hibernateUtil.getSession();
//        Transaction tx = session.beginTransaction();
//        TUser user = new TUser();
//        user.setUsername("testhibernate");
//        Random random = new Random();
//        user.setUserid(random.nextInt());
//        user.setApartmentid(1);
//        user.setEmail("z_y_ang@163.com");
//        session.save(user);
//        tx.commit();
//        session.close();

        return "login";
    }
}
