package com.design.pattern.structural.facade;

/**
 * Created by perl on 2019/6/14.
 * 测试类 模仿应用系统调用
 */
public class Test {

    public static void main(String[] args) {
        PointsGift gift = new PointsGift();
        gift.setName("超值大礼包");

        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchage(gift);
    }
}
