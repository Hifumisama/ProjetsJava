package com.doranco.jpa.interfaces.impl;

import com.doranco.jpa.interfaces.IStock;
import com.doranco.jpa.models.Stock;
import com.doranco.jpa.persistanceutils.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;

public class IStockImpl implements IStock {

    @Override
    public void createStock(Stock stock) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.save(stock);
        session.getTransaction().commit();
    }

    @Override
    public Stock readStock(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Stock stock = (Stock) session.load(Stock.class, new Long(id));
        return stock;
        
    }

    @Override
    public void updateStock(Stock stock) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.update(stock);
        session.getTransaction().commit();
    }

    @Override
    public void deleteStock(Stock stock) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        session.delete(stock.getId());
        session.getTransaction().commit();
    }
    
}
