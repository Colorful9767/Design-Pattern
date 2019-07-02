package com.design.pattern.behavior.strategy.v2;

/**
 * Created by perl on 2019/7/2.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        PromotionStrategyFactory.getPromotionStrategy("CB").doPromotion();
        System.out.println("----------------");
        PromotionStrategyFactory.getPromotionStrategy("VR").doPromotion();
        System.out.println("----------------");
        PromotionStrategyFactory.getPromotionStrategy("FR").doPromotion();
        System.out.println("----------------");
        PromotionStrategyFactory.getPromotionStrategy("xxxxx").doPromotion();
    }
}
