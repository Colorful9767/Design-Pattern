package com.design.pattern.behavior.strategy.v1;

/**
 * Created by perl on 2019/7/2.
 * 满减策略类
 */
public class FullReductionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("执行满减策略,满200-10");
    }
}
