package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 * 定期银行类
 */
public class DepositAccount implements Account{
    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}
