package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();

        Question q=new Question();
        q.setQuestionId(1211);
        q.setQuestion("What the hell?");

        Answer a=new Answer();
        a.setAnswerId(11);
        a.setAnswer("Nothing!😩");
        a.setQuestion(q);
        q.setAnswer(a);

        Question q1=new Question();
        q1.setQuestionId(1221);
        q1.setQuestion("What's up?");

        Answer a1=new Answer();
        a1.setAnswerId(121);
        a1.setAnswer("Nothing");
        a1.setQuestion(q1);
        q1.setAnswer(a1);

        List<Answer> list=new ArrayList<Answer>();
        list.add(a);
        list.add(a1);
        q1.setAnswers(list);

        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();

        s.save(q);
        s.save(q1);
        s.save(a);
        s.save(a1);

        tx.commit();

//
        s.close();
        sf.close();
    }
}
