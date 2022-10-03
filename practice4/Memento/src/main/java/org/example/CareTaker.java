package org.example;

import java.util.ArrayList;
import java.util.List;

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