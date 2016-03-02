package Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by xd on 2016/3/1.
 */
public class hibernateUtil {
    private static Configuration conf = new Configuration().configure();
    private static ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(conf.getProperties()).buildServiceRegistry();
    private static SessionFactory sf  = conf.buildSessionFactory(registry);

    public static Session getSession(){

        return sf.openSession();
    }
}
