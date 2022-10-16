package FactoryMethod;

public class ClassFactory {
    public static CharacterClass getClass(String type) {
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Sorcerer" -> new Sorcerer();
            default -> null;
        };
    }
}
