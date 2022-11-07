package Visitor.Race.Elf;

import Visitor.Race.CharacterRace;
import Visitor.Stats.Stats;

public class Elf extends CharacterRace {
    public Elf() {
        name = "Elf";
        bonuses = new Stats(0, 2, 0, 0, 1, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Hi, I'm an elf. Have you not seen orcs ?");
    }
}