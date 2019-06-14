package com.design.pattern.structural.decorator.v2;

/**
 * Created by perl on 2019/6/14.
 * 抽象装饰器类
 */
public class AbstractDecorator extends AbstractBattercake {
    private AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

    @Override
    protected String getDesc() {
        return this.abstractBattercake.getDesc();
    }

    @Override
    protected int getCost() {
        return this.abstractBattercake.getCost();
    }
}
