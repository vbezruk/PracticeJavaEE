package Visitor;

import java.util.TreeMap;
import CharacterCreator.Character;
import CharacterCreator.CharacterRace;
import CharacterCreator.Stats;
import CharacterCreator.CharacterClass;

public class ElementVisitor implements DataElementsVisitor{
    @Override
    public TreeMap visit (Character character){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Name", character.getName());
        treeMap.put("HP", character.getHealth());

        return treeMap;
    }

    @Override
    public TreeMap visit(CharacterRace characterRace){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Race", characterRace.getName());

        return treeMap;
    }
    
    @Override
    public TreeMap visit(CharacterClass characterClass){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Class", characterClass.getName());

        return treeMap;
    }

    @Override
    public TreeMap visit (Stats stats){
        TreeMap<String, Object> treeMap = new TreeMap<String, Object>();

        treeMap.put("Stats", stats.getStats());

        return treeMap;
    }
}