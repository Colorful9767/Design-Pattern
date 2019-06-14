package com.design.pattern.structural.facade;

/**
 * Created by perl on 2019/6/14.
 * 支付子系统服务
 */
public class PayService {
    public void pay(PointsGift gift) {
        System.out.println("支付礼物"+ gift.getName() +"成功");
    }
}
