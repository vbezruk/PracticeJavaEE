package org.example;

public class Thread2 extends Thread {
    Bank bank;

    Thread2(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 1; i <= 20000; i++) {
                bank.setAccount(bank.getAccount() - 1);
            }
            System.out.println("Thread dec: " + bank.getAccount());
        }
    }
}