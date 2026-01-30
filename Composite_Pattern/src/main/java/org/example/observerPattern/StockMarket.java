package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private List<Observer> investors = new ArrayList<>();
    private String stockName;
    private double price;

    public StockMarket(String stockName) {
        this.stockName = stockName;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void attach(Observer o) {
        investors.add(o);
    }

    @Override
    public void detach(Observer o) {
        investors.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : investors) {
            o.update(stockName, price);
        }
    }
}
