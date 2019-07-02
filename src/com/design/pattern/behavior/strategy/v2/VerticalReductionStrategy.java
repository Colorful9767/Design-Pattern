package com.design.pattern.behavior.strategy.v2;

/**
 * Created by perl on 2019/7/2.
 * 立减策略
 */
public class VerticalReductionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("执行立减策略......");
    }
}
