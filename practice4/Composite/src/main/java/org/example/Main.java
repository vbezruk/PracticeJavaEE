package org.example;

import java.awt.*;

public class Main {
    public static void main(String[] args) throws FieldLengthLimitException, IncorrectSalaryException, EmployeeInRegistryException {
        WorkersRegistry workers = WorkersRegistry.getRegistry();

        Manager CEO = new Manager("Jonh CEO", 1000, 500);
        Employee headSales = new Employee("Robert headSales", 1000);
        Employee headMarketing = new Employee("Michael headMarketing", 1100);
        Employee clerk1 = new Employee("Laura clerk1", 1050);
        Employee clerk2 = new Employee("Bob clerk2", 1050);
        Employee salesExecutive1 = new Employee("Richard salesExecutive1", 1100);
        Employee salesExecutive2 = new Employee("Rob salesExecutive2", 1100);

        workers.addWorker(CEO);
        workers.addWorker(headSales);
        workers.addWorker(headMarketing);
        workers.addWorker(clerk1);
        workers.addWorker(clerk2);
        workers.addWorker(salesExecutive1);
        workers.addWorker(salesExecutive2);

       // workers.printList();

        CEO.addSubordinate(headMarketing);
        CEO.addSubordinate(headSales);

        headSales.addSubordinate(salesExecutive1);
        headSales.addSubordinate(salesExecutive2);

        headMarketing.addSubordinate(clerk1);
        headMarketing.addSubordinate(clerk2);

        CEO.printEmployee();

        for (Employee subordinate : CEO.getSubordinates()) {
            subordinate.printEmployee();

            for (Employee employee : subordinate.getSubordinates()) {
                employee.printEmployee();
            }
        }
    }
}