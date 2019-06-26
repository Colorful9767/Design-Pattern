package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 * 工商银行类
 */
public class ICBCBank extends Bank {
    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        //  把行为委托出去
        account.openAccount();
        return account;
    }
}
