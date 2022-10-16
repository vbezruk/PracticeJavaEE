package FactoryMethod;

import FactoryMethod.Character.Character;
import FactoryMethod.Class.ClassFactory;

public class Demo {
    public static void main(String[] args) {
        Character fighter = new Character("Fighter", ClassFactory.getClass("Fighter"));
        fighter.talk();

        fighter.addClassBonuses();
        fighter.talk();

        Character sorcerer = new Character("Sorcerer", ClassFactory.getClass("Sorcerer"));
        sorcerer.talk();

        sorcerer.addClassBonuses();
        sorcerer.talk();
    }
}