package Visitor;

import java.util.TreeMap;

public interface DataElementsVisitor  {
    public TreeMap visit (Character character);

    public TreeMap visit(CharacterRace characterRace);

    public TreeMap visit (Stats stats);
}
