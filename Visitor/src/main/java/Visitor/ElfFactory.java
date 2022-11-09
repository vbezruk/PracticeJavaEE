package Visitor;

import Visitor.RaceAbstractFactory;
import Visitor.CharacterRace;
import Visitor.Elf;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Elf();
    }
}
