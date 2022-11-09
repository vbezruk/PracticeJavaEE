package Visitor;

import java.util.TreeMap;
import Visitor.CharacterRace;
import Visitor.Stats;

public class Character implements DataElement {
    private final String name;
    private final CharacterRace race;
    private final Stats attributes;

    public Character(String name, CharacterRace race) {
        this.name = name;
        this.race = race;

        attributes = Stats.generate();
    }

    public void addRaceBonuses() {
        for (String title : attributes.getStats().keySet()) {
            attributes.getStats().put(title, attributes.getStats().get(title) + race.getRaceBonuses().getStats().get(title));
        }
    }

    public void talk() {
        race.print();
        System.out.println("Attributes:");

        for (String attribute : attributes.getStats().keySet()) {
            System.out.println(attribute + ": " + attributes.getStats().get(attribute));
        }

        System.out.println();
    }

    public String getName() {
        return name;
    }

    public CharacterRace getRace() {
        return race;
    }

    public Stats getAttributes() {
        return attributes;
    }

    public TreeMap accept(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}