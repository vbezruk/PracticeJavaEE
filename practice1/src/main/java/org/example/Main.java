package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee("Vladyslav", "Bezruk", -600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Employee emp = new Employee("Vladyslavvvvvvvv", "Bezruk", 600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.println(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }

        try {
            Employee emp = new Employee("Vladyslav", "Bezruk", 600);

            System.out.println(emp);

        } catch (FieldLengthLimitException e) {
            System.out.printf(e.getMessage());
        }
        catch (IncorrectSalaryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}