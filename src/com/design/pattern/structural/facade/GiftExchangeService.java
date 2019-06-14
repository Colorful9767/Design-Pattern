package com.design.pattern.structural.facade;

/**
 * Created by perl on 2019/6/14.
 * 对外提供公共服务接口
 */
public class GiftExchangeService {

    private QualifyService qualifyService = new QualifyService();
    private PayService payService = new PayService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchage(PointsGift gift) {
        qualifyService.isQualify(gift);
        payService.pay(gift);
        shippingService.shipp(gift);
    }
}
