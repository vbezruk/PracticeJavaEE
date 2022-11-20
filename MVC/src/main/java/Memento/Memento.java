/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

import CharacterCreator.Stats;

public class Memento {
    private Stats state;

    public Memento() {

    }

    public Memento(Stats state) {
        this.state = state;
    }

    public void setState(Stats state) {
        this.state = state;
    }

    public Stats getState() {
        return state;
    }
}
