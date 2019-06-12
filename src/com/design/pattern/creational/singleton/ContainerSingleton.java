package com.design.pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by perl on 2019/6/12.
 * 容器单例模式实现
 */
public class ContainerSingleton {
    private static Map<String,Object> map = new HashMap<>();

    private ContainerSingleton() {

    }

    public static void setInstance(String key,Object instance) {
        if (!key.equals("") && instance != null && !map.containsKey(key)) {
            map.put(key,instance);
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }
}
