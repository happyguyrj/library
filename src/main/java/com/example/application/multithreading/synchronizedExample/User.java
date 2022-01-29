package com.example.application.multithreading.synchronizedExample;

public class User {

    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp(100);

        Thread thread1 = new Thread(() -> Atm.withdraw(account, 100));
        Thread thread2 = new Thread(() -> Atm.withdraw(account, 100));

        thread1.start();
        thread2.start();
    }
}
