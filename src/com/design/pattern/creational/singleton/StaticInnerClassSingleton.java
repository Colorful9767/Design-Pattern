package com.design.pattern.creational.singleton;

/**
 * Created by perl on 2019/6/10.
 * 静态内部类实现懒汉模式延迟初始化对象
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton() {

    }

    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }

}
