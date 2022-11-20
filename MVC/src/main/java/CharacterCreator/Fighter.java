/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

public class Fighter extends CharacterClass {
    private String perk;

    public Fighter() {
        this.name = "Fighter";
        this.hp = 10;
        this.perk = "Extra Attack";
    }

    @Override
    public void printMagica() {
        System.out.println("Character " + name + " has the ability " + perk);
    }
}