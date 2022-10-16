package AbstractFactory.Factory.Dwarf;

import AbstractFactory.Factory.RaceAbstractFactory;
import AbstractFactory.Race.CharacterRace;
import AbstractFactory.Race.Dwarf.Dwarf;

public class DwarfFactory implements RaceAbstractFactory {
    @Override
    public CharacterRace create() {
        return new Dwarf();
    }
}
