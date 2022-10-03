package org.example;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Character player = new Character("Ramirez de Salt", "bard", "half-elf");

        Stats temp = Stats.generateStats();
        player.setAttributes(temp);
        player.printInfo();

        CareTaker careTaker = new CareTaker();
        Memento memento = new Memento();

        for (int i = 0; i < 2; i++) {
            temp = Stats.generateStats();
            temp.printStats();
            memento.setState(temp);
            careTaker.add(memento.getState());
        }

        for (int i = 0; i < 2; i++) {
            memento.setState(careTaker.get(i));
            temp = memento.getState();
            temp.printStats();
        }
    }
}