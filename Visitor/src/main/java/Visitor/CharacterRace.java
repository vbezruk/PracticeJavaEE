package Visitor;

import Visitor.Stats;

import java.util.TreeMap;

public abstract class CharacterRace implements DataElement {
    protected String name;
    protected Stats bonuses;
    public Stats getRaceBonuses() {
        return bonuses;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.println("Race: " + name);

        for (String title : bonuses.getStats().keySet()) {
            System.out.println("Race bonus: " + title + " +" + bonuses.getStats().get(title));
        }

        System.out.println();
    }

    public abstract void saySMTH();

    public TreeMap accept(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}
