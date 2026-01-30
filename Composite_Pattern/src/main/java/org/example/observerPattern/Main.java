package org.example.observerPattern;

public class Main {
    public static void main(String[] args) {
        StockMarket appleStock = new StockMarket("AAPL");

        Observer inv1 = new Investor("LAN");
        Observer inv2 = new Investor("HUY");

        appleStock.attach(inv1);
        appleStock.attach(inv2);

        appleStock.setPrice(150.0);
        appleStock.setPrice(155.5);
    }
}
