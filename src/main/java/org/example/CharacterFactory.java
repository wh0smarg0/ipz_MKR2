package org.example;

// Фабричний метод
public class CharacterFactory {
    public static Character createCharacter(String type, String name) {
        return switch (type.toLowerCase()) {
            case "warrior" -> new Warrior(name);
            case "mage" -> new Mage(name);
            case "archer" -> new Archer(name);
            default -> throw new IllegalArgumentException("Invalid character type: " + type);
        };
    }
}
