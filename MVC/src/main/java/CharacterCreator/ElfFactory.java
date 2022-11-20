/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

public class ElfFactory implements RaceAbstractFactory {
    @Override
    public Elf create() {
        return new Elf();
    }
}
