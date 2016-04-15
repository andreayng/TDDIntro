package com.thoughtworks.tddintro.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        AccountBalance account = new AccountBalance(100);
        assertThat(account.depositMoney(50), is(150));
    }
//
//    @Test
//    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
//
//    }
//
//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
