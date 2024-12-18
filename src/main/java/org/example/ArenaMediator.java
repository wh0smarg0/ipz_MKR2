package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArenaMediator {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
        System.out.println("[Arena]: " + character.name + " has entered the arena!");
        character.displayInfo();
    }

    public void moveCharacter(Character character, int x, int y) {
        System.out.println("[Arena]: " + character.name + " moved to position (" + x + ", " + y + ")");
    }

    public void attack(Character attacker, Character target) {
        target.health -= attacker.attackPower;
        System.out.println("[Arena]: " + attacker.name + " attacks " + target.name + " for " + attacker.attackPower + " damage!");
        if (target.health <= 0) {
            System.out.println("[Arena]: " + target.name + " has been defeated!");
        } else {
            System.out.println("[Arena]: " + target.name + "'s health is now " + target.health);
        }
    }
}

