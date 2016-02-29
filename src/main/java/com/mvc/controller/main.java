package com.mvc.controller;

import com.mvc.model.TUser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by xd on 2016/1/29.
 */
@Controller
@RequestMapping(value = "/")
public class main {

    @RequestMapping
    public String indext() {

        Configuration conf = new Configuration().configure();
        ServiceRegistry registry = new ServiceRegistryBuilder().buildServiceRegistry();
        SessionFactory sf  = conf.buildSessionFactory(registry);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        TUser user = new TUser();
        user.setUsername("testhibernate");
        user.setUserid(2);
        session.save(user);
        tx.commit();
        session.close();

        return "testProject";
    }
}
