package com.design.pattern.structural.adapter.classadapter;

/**
 * Created by perl on 2019/6/18.
 * 被适配的类
 */
public class Adaptee {
    public void adapteeRequest() {
        System.out.println("被适配者的方法");
    }
}
