package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 * 农业银行类
 */
public class ABCBank extends Bank {
    ABCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国农业银行账号");
        //  把行为委托出去
        account.openAccount();
        return account;
    }
}
