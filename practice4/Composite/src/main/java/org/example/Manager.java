package org.example;

import java.util.ArrayList;

public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public Manager() {}

    public Manager(String name, double salary, double bonus) {
        this.id = nextId++;

        this.name = name;

        this.salary = salary;

        this.bonus = bonus;

        this.subordinates = new ArrayList<Employee>();
    }

    public void printEmployee() {
        System.out.println("INFO: id = " + id + " name = " + name + " salary = " + salary + " bonus = " + bonus);
    }
}
