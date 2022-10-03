package org.example;

public class IncorrectSalaryException extends Exception {
    public IncorrectSalaryException() {}

    public IncorrectSalaryException(String message) {
        super(message);
    }
}
