package com.design.pattern.structural.facade;

/**
 * Created by perl on 2019/6/14.
 * 物流子系统服务
 */
public class ShippingService {

    public void shipp(PointsGift gift) {
        System.out.println("物流系统接收"+ gift.getName() +"成功");
    }
}
