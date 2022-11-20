package org.example;

public class Thread1 extends Thread {
    Bank bank;

    Thread1(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        synchronized (bank) {
            for (int i = 1; i <= 20000; i++) {
                bank.setAccount(bank.getAccount() + 2);
            }
            System.out.println("Thread inc: " + bank.getAccount());
        }
    }
}
