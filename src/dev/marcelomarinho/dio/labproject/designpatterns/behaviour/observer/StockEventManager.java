package dev.marcelomarinho.dio.labproject.designpatterns.behaviour.observer;

import java.util.HashMap;

public class StockEventManager {

    private final HashMap<String, StockEventListener> subscriptions;

    public StockEventManager() {
        this.subscriptions = new HashMap<>();
    }

    public void subscribe(String event, StockEventListener eventListener) {
        this.subscriptions.put(event, eventListener);
    }

    public void unsubscribe(String event) {
        this.subscriptions.remove(event);
    }

    public void notify(String event, String message) {
        this.subscriptions.entrySet().stream()
                .filter(entry -> entry.getKey().equals(event))
                .forEach(entry -> entry.getValue().update(message));
    }

}
