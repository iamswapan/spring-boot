package com.app.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by swapan on 21/6/17.
 */
public class HibernateConfig {
    public static Configuration configure(){
        Configuration config=new Configuration().configure();
        return config;
    }

    public static Session getSession(){
        SessionFactory sessionFactory=configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        return session;
    }
}
