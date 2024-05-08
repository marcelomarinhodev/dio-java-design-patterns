package dev.marcelomarinho.dio.labproject.designpatterns.behaviour.observer;

public class ObserverMain {

    public static void main(String[] args) {

        StockPriceUpListener priceUpListener = new StockPriceUpListener();
        StockPriceDownListener priceDownListener = new StockPriceDownListener();

        StockEventManager manager = new StockEventManager();
        manager.subscribe("priceUp", priceUpListener);
        manager.subscribe("priceDown", priceDownListener);

        // both messages should be printed
        StockExchangeMonitor monitor = new StockExchangeMonitor(manager);
        monitor.notifyPriceUp("stock => NVIDIA");
        monitor.notifyPriceDown("stock => Alphabet");

        System.out.println("======");
        System.out.println("======");

        // priceDown message should not be printed
        manager.unsubscribe("priceDown");
        monitor.notifyPriceUp("stock => NVIDIA");
        monitor.notifyPriceDown("stock => Alphabet");
    }

}
