package org.example;

public class Character {
     private String name;
     private String dndclass;
     private String race;
     private Stats attributes;

     public Character() {
         name = "None";
         dndclass = "None";
         race = "None";
     }

     public Character(String name, String dndclass, String race) {
         this.name = name;
         this.dndclass = dndclass;
         this.race = race;
     }

    public Stats getAttributes() {
        return attributes;
    }

    public String getDndclass() {
        return dndclass;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public void setAttributes(Stats attributes) {
        this.attributes = attributes;
    }

    public void setDndclass(String dndclass) {
        this.dndclass = dndclass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void printInfo() {
        System.out.println("Name: " + name + "\nClass: " + dndclass + "\nRace: " + race);
        attributes.printStats();
    }
}
