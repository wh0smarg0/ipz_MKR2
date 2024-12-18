package org.example;

import java.util.ArrayList;
import java.util.List;

public class ObservableArena extends ArenaMediator {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    @Override
    public void addCharacter(Character character) {
        super.addCharacter(character);
        notifyObservers(character.name + " has entered the arena!");
    }
}