package com.design.pattern.behavior.strategy.v1;

/**
 * Created by perl on 2019/7/2.
 * 促销活动类
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excutePromotionStrategy() {
        promotionStrategy.doPromotion();
    }
}
