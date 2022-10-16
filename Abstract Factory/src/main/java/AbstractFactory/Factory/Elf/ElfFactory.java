package AbstractFactory.Factory.Elf;

import AbstractFactory.Factory.RaceAbstractFactory;
import AbstractFactory.Race.CharacterRace;
import AbstractFactory.Race.Elf.Elf;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
