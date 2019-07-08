package com.design.pattern.creational.singleton;

/**
 * Created by perl on 2019/6/10.
 * 懒汉式单例
 */
public class LazySingleton {
    //  step1 声明一个全局可访问的对象
    private static LazySingleton lazySingleton = null;
    //  Step2 定义私有构造器  防止外部通过new关键字实例化该对象

    private LazySingleton(){

    }

    /**
     * 提供对外开放获取对象的方法
     * @return
     */
    public static LazySingleton getInstance(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 解决线程安全问题 方式1
     * @return
     */
    public synchronized static  LazySingleton getInstance1(){
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    /**
     * 解决线程安全问题 方式2
     * @return
     */
    public static  LazySingleton getInstance2(){
        synchronized (LazySingleton.class){
            if (lazySingleton == null) {
                lazySingleton = new LazySingleton();
            }
        }

        return lazySingleton;
    }
}
