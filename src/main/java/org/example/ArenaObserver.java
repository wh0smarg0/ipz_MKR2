package org.example;

public class ArenaObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("[Observer]: " + message);
    }
}
