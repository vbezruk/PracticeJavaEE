package FactoryMethod.Character;

import FactoryMethod.Stats.Stats;

public class Character {
    private final String name;
    private final CharacterClass dndClass;
    private final int hp;
    private final Stats attributes;

    public Character(String name, CharacterClass dndClass) {
        this.name = name;
        this.dndClass = dndClass;
        this.hp = dndClass.getHp();
        attributes = Stats.generate();
        attributes.getStats().put("Health", hp);
    }

    public void addClassBonuses() {
        Integer health = dndClass.getHp() + (int) Math.floor(attributes.getStats().get("Constitution") / 2.) - 5;

        attributes.getStats().put("Health", health);
    }

    public void talk() {
        dndClass.printMagica();
        System.out.println("Attributes:");

        for (String attribut : attributes.getStats().keySet()) {
            System.out.println(attribut + ": " + attributes.getStats().get(attribut));
        }

        System.out.println();
    }
}
