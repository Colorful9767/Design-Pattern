package com.design.pattern.structural.decorator.v2;

/**
 * Created by perl on 2019/6/14.
 * 抽象煎饼类的实现
 */
public class Battercake extends AbstractBattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int getCost() {
        return 8;
    }
}
