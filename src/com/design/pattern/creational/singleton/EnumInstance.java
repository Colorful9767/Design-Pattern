package com.design.pattern.creational.singleton;

/**
 * Created by perl on 2019/6/12.
 * 枚举单例模式实现
 * 可以完美解决序列化和反射问题
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }
}
