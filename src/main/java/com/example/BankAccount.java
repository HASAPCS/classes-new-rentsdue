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
        if (this.balance<0){
            this.balance+=amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
}
