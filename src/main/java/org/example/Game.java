package org.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ObservableArena arena = new ObservableArena();
        ArenaObserver observer = new ArenaObserver();
        arena.addObserver(observer);

        // Створення персонажів
        System.out.println("🎮 Вітаємо у грі! Створіть персонажів.");
        CharacterFactory factory = new CharacterFactory();
        Character[] characters = new Character[2]; // Дозволяємо додати 2 персонажі

        for (int i = 0; i < 2; i++) {
            System.out.print("\nВиберіть тип персонажа (warrior, mage, archer): ");
            String type = scanner.nextLine();
            System.out.print("Введіть ім'я персонажа: ");
            String name = scanner.nextLine();
            characters[i] = factory.createCharacter(type, name);
            arena.addCharacter(characters[i]);
        }

        // Дії на арені
        System.out.println("\n🎯 Дії на арені:");
        arena.moveCharacter(characters[0], 5, 5);
        arena.moveCharacter(characters[1], 2, 8);
        arena.attack(characters[0], characters[1]);
    }
}