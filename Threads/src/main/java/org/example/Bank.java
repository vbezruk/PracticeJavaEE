package org.example;

public class Bank {
    private int account = 1;

    public synchronized void inc() {
        for (; account < 20000; account++) {
            System.out.println("inc: " + account);
        }
    }
    public synchronized void dec() {
        for (; account > 0; account--) {
            System.out.println("dec: " + account);
        }
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }
}
