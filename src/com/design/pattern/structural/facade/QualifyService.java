package com.design.pattern.structural.facade;

/**
 * Created by perl on 2019/6/14.
 * 资格校验服务
 */
public class QualifyService {

    public void isQualify(PointsGift gift) {
        System.out.println("礼物"+ gift.getName() +"校验资格成功");
    }
}
