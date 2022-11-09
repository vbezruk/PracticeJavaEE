package Visitor;

import Visitor.RaceAbstractFactory;
import Visitor.CharacterRace;
import Visitor.Dwarf;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
