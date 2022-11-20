/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

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
