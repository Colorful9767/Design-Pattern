package com.design.pattern.structural.decorator.v1;

/**
 * Created by perl on 2019/6/14.
 * 测试类
 * 使用继承方式模拟卖煎饼
 * 缺点不够灵活
 */
public class Test {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        BattercakeWithEggAndSausage battercakeWithEggAndSausage = new BattercakeWithEggAndSausage();

        System.out.println("菜单:");
        System.out.println(battercake.getDesc() + ":" + battercake.getCost() + "￥");
        System.out.println(battercakeWithEgg.getDesc() + ":" + battercakeWithEgg.getCost() + "￥");
        System.out.println(battercakeWithEggAndSausage.getDesc() + ":" + battercakeWithEggAndSausage.getCost() + "￥");
    }


}
