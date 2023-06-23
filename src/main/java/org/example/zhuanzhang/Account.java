package org.example.zhuanzhang;

public class Account{
    private int balance;
    public  String name;

    public Account(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public void transfer(Account target, int money) {
        synchronized (Account.class) {
            if (money <= balance) {
                balance -= money;
                target.balance += money;
            }
        }
    }

    public int getBlance() {
        return balance;
    }

    public void setBlance(int blance) {
        this.balance = blance;
    }
}

