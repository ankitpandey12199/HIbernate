package org.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Student obj = new Student();
        obj.setId(2);
        obj.setName("Ashish");
        obj.setCity("Daltonganj");

        System.out.println(obj);
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(obj);
        tx.commit();
        session.close();
    }
}
