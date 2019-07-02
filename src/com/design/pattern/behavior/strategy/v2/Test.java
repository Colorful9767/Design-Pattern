package com.design.pattern.behavior.strategy.v2;

/**
 * Created by perl on 2019/7/2.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity cashBackPromotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("CB"));
        cashBackPromotionActivity.excutePromotionStrategy();
        System.out.println("----------------");
        PromotionActivity verticalPromotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("VR"));
        verticalPromotionActivity.excutePromotionStrategy();
        System.out.println("----------------");
        PromotionActivity fullPromotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("FR"));
        fullPromotionActivity.excutePromotionStrategy();
        System.out.println("----------------");
        PromotionActivity emptyPromotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy("xx"));
        emptyPromotionActivity.excutePromotionStrategy();
    }
}
