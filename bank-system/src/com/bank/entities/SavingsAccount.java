package com.bank.entities;

import com.bank.models.IAccount;

public class SavingsAccount extends IAccount {
    protected int accountId;
    protected User user;
    protected double balance = 0;

    public SavingsAccount(int accountId, User user) {
        this.accountId = accountId;
        this.user = user;
    }

    public void deposit(double valueToDeposit) {
        valueToDeposit = (valueToDeposit < 0) ? valueToDeposit * -1 : valueToDeposit;
        this.balance += valueToDeposit;
    }

    public boolean withdraw(double valueToWithdraw) {
        if (this.balance < valueToWithdraw) return false;
        
        this.balance -= valueToWithdraw;
        return true;
    }

    


}
