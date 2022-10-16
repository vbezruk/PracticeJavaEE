package AbstractFactory;

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