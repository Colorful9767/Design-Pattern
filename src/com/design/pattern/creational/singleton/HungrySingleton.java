package com.design.pattern.creational.singleton;

import java.io.Serializable;

/**
 * Created by perl on 2019/6/12.
 * 饿汉式单例模式
 * 非延迟加载对象
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例模式禁止反射构造器调用");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    /**
     * 解决序列化时 单例对象不一致的问题
     * @return
     */
    private Object readResolve() {
        return hungrySingleton;
    }
}
