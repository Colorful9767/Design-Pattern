package com.design.pattern.behavior.strategy.v2;

/**
 * Created by perl on 2019/7/2.
 * 空策略
 */
public class EmptyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
