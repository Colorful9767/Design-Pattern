package com.design.pattern.behavior.observe;

import com.google.common.eventbus.EventBus;

/**
 * Created by perl on 2019/7/3.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher();
        eventBus.register(teacher);
        eventBus.post(new Student("jack","i like a lot of money"));
    }
}
