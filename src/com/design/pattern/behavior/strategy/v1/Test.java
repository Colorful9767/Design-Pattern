package com.design.pattern.behavior.strategy.v1;

/**
 * Created by perl on 2019/7/2.
 */
public class Test {

    public static void main(String[] args) {
        PromotionActivity cashBackPromotionActivity = new PromotionActivity(new CashBackStrategy());
        cashBackPromotionActivity.excutePromotionStrategy();

        System.out.println("----------------");

        PromotionActivity fullReductionActivity = new PromotionActivity(new FullReductionStrategy());
        fullReductionActivity.excutePromotionStrategy();

        System.out.println("----------------");

        PromotionActivity verticalReductionActivity = new PromotionActivity(new VerticalReductionStrategy());
        verticalReductionActivity.excutePromotionStrategy();
    }
}
