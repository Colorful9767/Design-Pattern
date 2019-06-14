package com.design.pattern.structural.decorator.v2;

/**
 * Created by perl on 2019/6/14.
 * 测试类
 * 抽象装饰模式实现
 */
public class Test {

    public static void main(String[] args) {
        AbstractBattercake abstractBattercake;
        abstractBattercake = new Battercake();
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new EggDecorator(abstractBattercake);
        abstractBattercake = new SausageDecorator(abstractBattercake);

        System.out.println("买了个煎饼");
        System.out.println("配料有: " + abstractBattercake.getDesc() + " 一共 " + abstractBattercake.getCost() + " ￥");

    }
}
