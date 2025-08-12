src/main/java/com/example/MainApp.java

        package com.example;

import com.example.entity.Account;
import com.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MainApp {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;

        try {
            tx = session.beginTr    ansaction();

            Account from = session.get(Account.class, 1); // Alice 
            Account to = session.get(Account.class, 2);   // Bob 

            double amount = 1000;

            if (from.getBalance() < amount) {
                throw new RuntimeException("Insufficient funds!");
            }

            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            session.update(from);
            session.update(to);

            tx.commit();
            System.out.println("Transaction successful!");
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            System.err.println("Transaction failed: " + e.getMessage());
        } finally {
            session.close();
            HibernateUtil.getSessionFactory().close();
        }
    }
} 
  