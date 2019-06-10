package com.design.pattern.creational.singleton;

/**
 * Created by perl on 2019/6/10.
 * 懒汉模式
 * double-check 双重检测
 * 实现懒加载
 * 兼顾性能
 */
public class LazyDoubleCheckSingleton {
    //  增加volatile关键字 防止创建对象时 重排序导致的问题
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton() {

    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }

        return lazyDoubleCheckSingleton;
    }
}
