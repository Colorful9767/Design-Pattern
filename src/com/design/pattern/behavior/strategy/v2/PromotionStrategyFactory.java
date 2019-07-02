package com.design.pattern.behavior.strategy.v2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by perl on 2019/7/2.
 * 策略工厂类
 */
public class PromotionStrategyFactory {
    private static Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();
    private static final PromotionStrategy NULL_PROMOTION_STRATEGY = new EmptyStrategy();

    static {
        PROMOTION_STRATEGY_MAP.put(PromotinStrategyKey.CASH_BACK,new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotinStrategyKey.FULL_REDUCTION,new FullReductionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotinStrategyKey.VERTICAL_REDUCTION,new VerticalReductionStrategy());
    }

    private PromotionStrategyFactory() {

    }

    public static PromotionStrategy getPromotionStrategy(String key) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(key);
        return promotionStrategy == null ? NULL_PROMOTION_STRATEGY : promotionStrategy;
    }

    private interface PromotinStrategyKey {
        String CASH_BACK = "CB";
        String FULL_REDUCTION = "FR";
        String VERTICAL_REDUCTION = "VR";
    }
}
