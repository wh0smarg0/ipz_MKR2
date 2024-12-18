package org.example;

//Клас мага
public class Mage extends Character {
    public Mage(String name) {
        super(name, 100, 40);
    }

    @Override
    public void displayInfo() {
        System.out.println("🧙 Mage " + name + " - Health: " + health + ", Attack: " + attackPower);
    }
}
