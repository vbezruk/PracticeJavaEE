package Visitor.Factory.Dwarf;

import Visitor.Factory.RaceAbstractFactory;
import Visitor.Race.CharacterRace;
import Visitor.Race.Dwarf.Dwarf;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
