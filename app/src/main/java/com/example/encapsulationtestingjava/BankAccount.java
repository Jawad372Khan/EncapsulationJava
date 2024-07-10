package com.example.encapsulationtestingjava;

public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0.0) {
            balance += amount;
            System.out.println(balance);
        } else {
            throw new IllegalArgumentException("Invalid Amount");
        }
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(balance);
        } else {
            throw new IllegalArgumentException("Invalid Amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}
