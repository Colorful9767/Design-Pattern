package com.design.pattern.structural.bridge;

/**
 * Created by perl on 2019/6/26.
 * 银行抽象类
 */
public abstract class Bank {

    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}
