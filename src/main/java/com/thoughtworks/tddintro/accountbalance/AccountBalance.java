package com.thoughtworks.tddintro.accountbalance;

/**
 * Created by Andie on 4/15/2016.
 * Manages an account balance that can be deposited into or withdrawn from; if balance is insufficient for withdrawal
 * the withdrawal is not made.
 */
public class AccountBalance {
    private int balance;

    public AccountBalance(int balance) {
        this.balance = balance;
    }

    // deposit money in account
    public void depositMoney(int i) {
        balance += i;
    }

    // withdraw money from account
    public void withdrawMoney(int i ) {
        if(balance >= i) {
            balance -= i;
        }
    }

    public Integer getBalance() {
        return balance;
    }
}
