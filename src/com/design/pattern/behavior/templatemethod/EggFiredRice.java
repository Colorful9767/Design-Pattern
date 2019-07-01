package com.design.pattern.behavior.templatemethod;

/**
 * Created by perl on 2019/7/1.
 * 蛋炒饭类
 */
public class EggFiredRice extends AFriedRice {
    @Override
    void addMainFood() {
        System.out.println("加入主料:鸡蛋");
    }
}
