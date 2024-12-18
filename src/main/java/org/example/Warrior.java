package org.example;

//Клас воїна
public class Warrior extends Character {
    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void displayInfo() {
        System.out.println("⚔️ Warrior " + name + " - Health: " + health + ", Attack: " + attackPower);
    }
}
