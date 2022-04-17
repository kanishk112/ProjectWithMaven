package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;


public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Program Started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();

        //Creating Student object
        student st=new student();
        st.setId(101);
        st.setName("Ram");
        st.setCity("Jammu");
//        sf.getCurrentSession();
        System.out.println(st);

        //Creating Address Object
        Address ad=new Address();
        ad.setCity("Jalandhar");
        ad.setStreet("120 Madhuban Colony");
        ad.setAddedDate(new Date());
        ad.setOpen(true);
        ad.setX(123.987);

        //Reading Image
        FileInputStream fs=new FileInputStream("src/1.jpeg");
        byte[] data=new byte[fs.available()];
        fs.read(data);
        ad.setImage(data);

        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();
        s.save(st);
        s.save(ad);
        s.getTransaction().commit();
        System.out.println("Done!!!!!!!");
        s.close();
    }
}
