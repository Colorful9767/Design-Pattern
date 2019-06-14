package com.design.pattern.structural.decorator.v2;

/**
 * Created by perl on 2019/6/14.
 * 抽象装饰器类实现
 * 鸡蛋类
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 鸡蛋";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 2;
    }
}
