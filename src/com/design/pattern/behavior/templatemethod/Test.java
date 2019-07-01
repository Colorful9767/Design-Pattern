package com.design.pattern.behavior.templatemethod;

/**
 * Created by perl on 2019/7/1.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("---开始制作蛋炒饭---");
        AFriedRice eggFiredRice = new EggFiredRice();
        eggFiredRice.friedRice();
        System.out.println("---制作完成---");

        System.out.println("-------------------------------");

        System.out.println("---开始制作肉丝炒饭---");
        AFriedRice shreddedMeatFriedRice = new ShreddedMeatFriedRice();
        shreddedMeatFriedRice.friedRice();
        System.out.println("---制作完成---");

    }
}
