package Visitor.Factory.Elf;

import Visitor.Factory.RaceAbstractFactory;
import Visitor.Race.CharacterRace;
import Visitor.Race.Elf.Elf;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
