package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchClass {
    public static void main(String[] args) {
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory s=cfg.buildSessionFactory();
        Session ss=s.openSession();

        //get
        student st=(student) ss.get(student.class,101);
        System.out.println(st);

        Address ad=(Address) ss.get(Address.class,1);
        System.out.println(ad);

        ss.close();
        s.close();
    }
}
