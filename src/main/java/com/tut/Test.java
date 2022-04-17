package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();

        student st=new student();
        st.setId(1043);
        st.setName("Sam");
        st.setCity("Jalandhar");
        System.out.println(st);

        student st1=new student();
        st1.setId(103);
        st1.setName("Sam");
        st1.setCity("Jalandhar");
        System.out.println(st1);

        Certificate c1=new Certificate();
        c1.setCourse("C#");
        c1.setDuration("3 Months");
        System.out.println(c1);

        Certificate c=new Certificate();
        c.setCourse("C++");
        c.setDuration("2 Months");
        System.out.println(c);

        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();

        s.save(st);
        s.save(st1);

        tx.commit();
        s.close();
        sf.close();
    }
}
