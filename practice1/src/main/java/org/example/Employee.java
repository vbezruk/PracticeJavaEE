package org.example;

public class Employee {
    private int id;
    private static int nextId = 0;
    private String name;
    private String surname;
    private double salary;

    public Employee() {
        id = nextId++;
        name = "None";
        surname = "None";
        salary = 0;
    }

    public Employee(String name, String surname, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        id = nextId++;

        if (name.length() > FieldLengthLimitException.maxLength) {
            throw new FieldLengthLimitException("Name is too long");
        } else {
            this.name = name;
        }

        if (surname.length() > FieldLengthLimitException.maxLength) {
            throw new FieldLengthLimitException("Surname is too long");
        } else {
            this.surname = surname;
        }

        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary is incorrect");
        } else {
            this.salary = salary;
        }
    }

    @Override
    public String toString() {
        return "INFO: id = " + id + " name = " + name + " surname = " + surname + " salary = " + salary;
    }
}
