package com.design.pattern.behavior.strategy.v1;

/**
 * Created by perl on 2019/7/2.
 * 返现策略
 */
public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("执行返现策略,返现金额直接打入用户余额中。");
    }
}
