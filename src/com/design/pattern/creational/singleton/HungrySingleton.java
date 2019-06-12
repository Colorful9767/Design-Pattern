package com.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by perl on 2019/6/12.
 * 饿汉式单例模式
 * 非延迟加载对象
 */
public class HungrySingleton {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
