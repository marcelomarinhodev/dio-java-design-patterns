package dev.marcelomarinho.dio.labproject.designpatterns.behaviour.observer;

public class StockExchangeMonitor {

    private final StockEventManager manager;

    public StockExchangeMonitor(StockEventManager manager) {
        this.manager = manager;
    }

    public void notifyPriceUp(String message) {
        this.manager.notify("priceUp", message);
    }

    public void notifyPriceDown(String message) {
        this.manager.notify("priceDown", message);
    }

}
