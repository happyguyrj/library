package com.example.application.multithreading.synchronizedExample;

public class Atm {

    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();

        if (balance - amount < - account.getOverdraft()) {
            System.out.println("Transaction denied");
        } else {
            account.debit(amount);
            System.out.println("$" + amount + " withdrawn");
        }
        System.out.println("Current balance: " + account.getBalance());
    }
}
