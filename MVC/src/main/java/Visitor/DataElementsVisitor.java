package Visitor;

import java.util.TreeMap;
import CharacterCreator.Character;
import CharacterCreator.CharacterRace;
import CharacterCreator.CharacterClass;
import CharacterCreator.Stats;

public interface DataElementsVisitor  {
    public TreeMap visit (Character character);

    public TreeMap visit(CharacterRace characterRace);

    public TreeMap visit(CharacterClass characterClass);
    
    public TreeMap visit (Stats stats);
}