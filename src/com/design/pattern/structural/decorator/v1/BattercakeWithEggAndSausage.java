package com.design.pattern.structural.decorator.v1;

/**
 * Created by perl on 2019/6/14.
 * 煎饼+鸡蛋+香肠
 */
public class BattercakeWithEggAndSausage extends BattercakeWithEgg{

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 4;
    }
}
