/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

import java.util.TreeMap;
import Visitor.DataElement;
import Visitor.DataElementsVisitor;

public class Character implements DataElement {
    private String name;
    private CharacterRace race;
    private CharacterClass ChClass;
    private Stats attributes;

    public Character(String name, CharacterClass ChClass, CharacterRace race) {
        this.name = name;
        this.race = race;
        this.ChClass = ChClass;

        attributes = Stats.generate();
    }
    
    public int getHealth() {
        return ChClass.getHp();
    }
    
    public CharacterRace getRace() {
        return race;
    }
    
    public void setRace(CharacterRace race) {
        this.race = race;
    }
    
    public CharacterClass getChClass() {
        return ChClass;
    }

    public Stats getAttributes() {
        return attributes;
    }
    
    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
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
    
    public void printSheet(){
        System.out.println("Name: "+name+"\n"+ChClass.toString()+"\nHealth points:"+getHealth());
        ChClass.printMagica();
        race.print();
        talk();
    }

   @Override
    public TreeMap accept(DataElementsVisitor visitor) {
        return visitor.visit(this);
    }
}