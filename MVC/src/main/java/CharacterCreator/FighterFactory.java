/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

/**
 *
 * @author Vladyslav Bezruk
 */

public class FighterFactory implements ClassAbstractFactory {
    @Override
    public CharacterClass create() {
        return new Fighter();
    }
}
