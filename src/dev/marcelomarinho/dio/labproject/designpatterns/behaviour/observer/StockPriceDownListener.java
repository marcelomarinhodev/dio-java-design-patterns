package dev.marcelomarinho.dio.labproject.designpatterns.behaviour.observer;

public class StockPriceDownListener implements StockEventListener {

    @Override
    public void update(String message) {
        System.out.printf("PRICE DOWN UPDATE: %s %n", message);
        System.out.println("<price down logic will run... send email, auto sell, etc>");
    }
}
