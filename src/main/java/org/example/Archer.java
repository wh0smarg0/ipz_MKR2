package org.example;

//Клас лучника
public class Archer extends Character {
    public Archer(String name) {
        super(name, 120, 30);
    }

    @Override
    public void displayInfo() {
        System.out.println("🏹 Archer " + name + " - Health: " + health + ", Attack: " + attackPower);
    }
}
