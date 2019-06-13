package com.design.pattern.creational.prototype.abstractPrototype;

/**
 * Created by perl on 2019/6/13.
 * 抽象类实现原型模式
 */
public class B extends A {
    public static void main(String[] args) throws CloneNotSupportedException {
        B b = new B();
        B bc = (B) b.clone();

        System.out.println(b);
        System.out.println(bc);
    }
}
