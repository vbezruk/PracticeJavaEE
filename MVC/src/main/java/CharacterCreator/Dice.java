/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CharacterCreator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice {
    private static int roll() {
        Random random = new Random();

        return (int) Math.round(8 * random.nextDouble());
    }

    public static int rollStat() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 6; i++) {
            list.add(roll());
        }

        Collections.sort(list, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += list.get(i);
        }

        return sum;
    }
}
