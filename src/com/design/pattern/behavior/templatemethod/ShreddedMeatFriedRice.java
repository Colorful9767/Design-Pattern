package com.design.pattern.behavior.templatemethod;

/**
 * Created by perl on 2019/7/1.
 *
 */
public class ShreddedMeatFriedRice extends AFriedRice {
    @Override
    void addMainFood() {
        System.out.println("放入主料: 肉丝");
    }

    @Override
    protected boolean isVegetarian() {
        return true;
    }
}
