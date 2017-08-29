package com.doranco.jpa;

import com.doranco.jpa.interfaces.IStock;
import com.doranco.jpa.interfaces.impl.IStockImpl;
import com.doranco.jpa.models.Stock;
import com.doranco.jpa.models.TYPE_STOCK;
import com.doranco.jpa.persistanceutils.HibernateUtil;
import java.util.Date;
import org.hibernate.Session;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Stock stock = new Stock();
        stock.setName("Eau_Doranco");
        stock.setQuantite(5);
        stock.setDatearrivee(new Date());
        stock.setDlc(new Date());
        stock.setDatesortie(new Date());
        session.save(stock);
        session.getTransaction().commit();
        * */
        
        Stock stock = new Stock();
        stock.setTypeStock(TYPE_STOCK.DRESS);
        stock.setName("Eau_Doranco");
        stock.setQuantite(5);
        stock.setDatearrivee(new Date());
        stock.setDlc(new Date());
        stock.setDatesortie(new Date());
        
        IStock stockDao = new IStockImpl();
        stockDao.createStock(stock);
        System.out.println(stockDao.readStock(1));
        
        
    }
    
}
