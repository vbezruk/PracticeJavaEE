/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Memento;

import java.util.ArrayList;
import java.util.List;
import CharacterCreator.Stats;

public class CareTaker {
    private List<Object> mementoList = new ArrayList<>();

    static int saveID = 0;

    public void add(Object object) {
        mementoList.add(object);

        System.out.println("State saved with " + saveID + " id\n");

        saveID++;
    }

    public Object get(int index) {
        System.out.println("Loading stats from save " + index + "\n");

        return mementoList.get(index);
    }
    
    public Object getLast(){
        return mementoList.get(mementoList.size()-1);
    }
    
    public boolean isEmptyList(){
        return mementoList.isEmpty();
   }
}