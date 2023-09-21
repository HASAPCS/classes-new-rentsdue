package com.example;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance=balance;
    }

    public void deposit(double amount) {
        this.balance +=amount;
    }

    public void withdraw(double amount) {
        this.balance -=amount;
        if (this.balance-amount<0){
            this.balance=balance;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
