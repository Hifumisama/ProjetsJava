package com.doranco.jpa.interfaces;

import com.doranco.jpa.models.Stock;

public interface IStock {
    public void createStock(Stock stock);
    public Stock readStock(long id);
    public void updateStock(Stock stock);
    public void deleteStock(Stock stock);
}
