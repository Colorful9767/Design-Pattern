package com.design.pattern.structural.adapter.objectadapter;


/**
 * Created by perl on 2019/6/18.
 * 适配器类
 * 对象适配器模式 Object-Adapter （组合方式）
 * 通过实例化被适配对象来实现接口适配
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
