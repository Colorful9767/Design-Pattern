package com.design.pattern.structural.decorator.v2;

/**
 * Created by perl on 2019/6/14.
 * 抽象装饰器类实现
 * 香肠类
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " + 香肠";
    }

    @Override
    protected int getCost() {
        return super.getCost() + 4;
    }
}
