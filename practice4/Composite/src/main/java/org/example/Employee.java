package org.example;

import java.util.List;
import java.util.ArrayList;

public class Employee {
    protected String name;
    protected String departmentName;
    protected double salary;
    protected int id;
    protected static int nextId = 0;
    protected ArrayList<Employee> subordinates;

    public Employee() {
        name = "None";
        departmentName = "None";
        salary = 0;
    }

    public Employee(String name, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        id = nextId++;

        if (name.length() > FieldLengthLimitException.maxLength) {
            throw new FieldLengthLimitException("Name is too long");
        } else {
            this.name = name;
        }

        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary is incorrect");
        } else {
            this.salary = salary;
        }

        subordinates = new ArrayList<Employee>();
    }


    public void addSubordinate(Employee emp) {
        subordinates.add(emp);
    }

    public void removeSubordinate(Employee emp) {
        subordinates.remove(emp);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void printEmployee() {
        System.out.println("INFO: id = " + id + " name = " + name + " salary = " + salary);
    }

    public int getId() {
        return id;
    }
}
