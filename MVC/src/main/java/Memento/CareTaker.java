/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

import java.util.ArrayList;
import java.util.List;
import CharacterCreator.Stats;

public class CareTaker {
    private List<Stats> mementoList = new ArrayList<Stats>();

    static int saveID = 0;

    public void add(Stats state) {
        mementoList.add(state);

        System.out.println("State saved with " + saveID + " id\n");

        saveID++;
    }

    public Stats get(int index) {
        System.out.println("Loading stats from save " + index + "\n");

        return mementoList.get(index);
    }
}