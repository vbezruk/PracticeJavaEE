/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

public class RaceFactory {
    public static CharacterRace getRace(RaceAbstractFactory factory){
        return factory.create();
    }
}