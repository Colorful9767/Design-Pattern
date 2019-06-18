package com.design.pattern.structural.adapter.classadapter;

/**
 * Created by perl on 2019/6/18.
 * 目标接口的具体实现
 */
public class ITarget implements Target {
    @Override
    public void request() {
        System.out.println("ITarget目标方法");
    }
}
