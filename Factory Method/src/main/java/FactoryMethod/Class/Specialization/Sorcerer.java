package FactoryMethod.Class.Specialization;

import FactoryMethod.Character.CharacterClass;

import java.util.ArrayList;
import java.util.List;

public class Sorcerer extends CharacterClass {
    private final List<String> spells;

    public Sorcerer() {
        this.name = "Sorcerer";
        this.hp = 6;
        this.spells = new ArrayList(List.of(new String[]{"Meteor", "Earthquake"}));
    }

    @Override
    public void printMagica() {
        System.out.print("Character " + name + " has the ability ");

        for (String spell : spells) {
            System.out.print(spell);

            if (spell != spells.get(spells.size() - 1)) {
                System.out.print(", ");
            } else {
                System.out.println();
            }
        }
    }
}
