package com.design.pattern.creational.prototype.abstractPrototype;

/**
 * Created by perl on 2019/6/13.
 * 抽象类重写clone()方法
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
