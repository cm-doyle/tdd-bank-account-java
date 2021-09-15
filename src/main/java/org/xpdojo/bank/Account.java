package org.xpdojo.bank;

public class Account {
    public int balance;
    public Money balance;

    public void deposit(int i) {
        // int initialises to zero, Integer initialises to null
        balance += i;
    }

    public void withdraw(int i) {
        balance -= i;
    }

    public void deposit(Money) {


    }


    }

    interface Output {
        void print();

        public static class ConsoleOutput implements Output {

            @Override
            public void print() {
                new ConsoleOutput().print();


        }
    }

}

