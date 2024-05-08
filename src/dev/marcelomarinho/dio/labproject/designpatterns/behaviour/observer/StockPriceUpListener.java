package dev.marcelomarinho.dio.labproject.designpatterns.behaviour.observer;

public class StockPriceUpListener implements StockEventListener {

    @Override
    public void update(String message) {
        System.out.printf("PRICE UP UPDATE: %s %n", message);
        System.out.println("<price up logic will run... send email, auto buy, etc>");
    }

}
