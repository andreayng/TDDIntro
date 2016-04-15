package com.thoughtworks.tddintro.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        AccountBalance account = new AccountBalance(100);
        account.depositMoney(50);
        assertThat(account.getBalance(), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        AccountBalance account = new AccountBalance(100);
        account.withdrawMoney(50);
        assertThat(account.getBalance(), is(50));
    }

//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
