package com.design.pattern.structural.decorator.v1;

/**
 * Created by perl on 2019/6/14.
 * 煎饼加鸡蛋
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
