package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 */
public class Test {

    public static void main(String[] args) {
        Bank abcBank = new ABCBank(new DepositAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        Bank icbcBank = new ICBCBank(new SavingAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();
    }
}
