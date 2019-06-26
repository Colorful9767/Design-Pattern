package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 * 活期银行类
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}
