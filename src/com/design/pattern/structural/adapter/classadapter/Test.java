package com.design.pattern.structural.adapter.classadapter;

/**
 * Created by perl on 2019/6/18.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        Target target = new ITarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
