package AbstractFactory;

import AbstractFactory.Character.Character;
import AbstractFactory.Factory.Elf.ElfFactory;
import AbstractFactory.Factory.RaceAbstractFactory;
import AbstractFactory.Factory.Dwarf.DwarfFactory;

public class Demo {
    public static void main(String[] args) {
        RaceAbstractFactory raceAbstractFactory = new DwarfFactory();

        Character character = new Character("Dwarf", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();

        raceAbstractFactory = new ElfFactory();

        character = new Character("Elf", raceAbstractFactory.create());
        character.addRaceBonuses();
        character.talk();
    }
}