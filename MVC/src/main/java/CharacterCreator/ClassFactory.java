/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

/**
 *
 * @author Vladyslav Bezruk
 */

public class ClassFactory {
    public static CharacterClass getClass(ClassAbstractFactory factory){
        return factory.create();
    }
}
