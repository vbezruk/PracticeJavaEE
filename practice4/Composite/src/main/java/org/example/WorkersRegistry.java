package org.example;

import java.util.ArrayList;

public class WorkersRegistry {
    private static WorkersRegistry instance = null;
    private final ArrayList<Employee> workers = new ArrayList<Employee>();
    private WorkersRegistry() {

    }

    public static WorkersRegistry getRegistry() {
        if (instance == null) {
            instance = new WorkersRegistry();
        }

        return instance;
    }

    public void addWorker(Employee employee) throws EmployeeInRegistryException {
        if (workers.size() == 0) {
            workers.add(employee);
        } else {
            for (Employee emp : workers) {
                if (emp.getId() == employee.getId()) {
                    throw new EmployeeInRegistryException("Such a worker is already on the list");
                }
            }
            workers.add(employee);
        }
    }

    public void printList() {
        if (workers.size() == 0) {
            System.out.println("List in empty");
        } else {
            System.out.println("The list includes:");

            for (Employee employee : workers) {
                employee.printEmployee();
            }
        }
    }
}
