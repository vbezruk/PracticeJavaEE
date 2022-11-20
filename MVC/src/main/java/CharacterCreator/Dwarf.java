/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

public class Dwarf extends CharacterRace {
    public Dwarf(){
        this.name = "Dwarf";
        this.bonuses = new Stats(2, 0, 2, 0, 0, 0);
    }

    @Override
    public void saySMTH() {
        System.out.println("Hi, I'm a dwarf. I went to work in the mine!");
    }
}