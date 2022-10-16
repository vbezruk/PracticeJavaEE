package FactoryMethod.Class;

import FactoryMethod.Character.CharacterClass;
import FactoryMethod.Class.Specialization.Fighter;
import FactoryMethod.Class.Specialization.Sorcerer;

public class ClassFactory {
    public static CharacterClass getClass(String type) {
        return switch (type) {
            case "Fighter" -> new Fighter();
            case "Sorcerer" -> new Sorcerer();
            default -> null;
        };
    }
}
