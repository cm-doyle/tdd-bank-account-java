package org.xpdojo.bank;

public class Account {
    public int balance;
    public int currentBalance;
    public int newBalance;

    public void deposit(int i) {
        // int initialises to zero, Integer initialises to null
        balance += i;


    }

    public void withdraw(int i) {
        currentBalance = balance;
        balance = currentBalance - i;

    }

}

