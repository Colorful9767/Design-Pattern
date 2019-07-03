package com.design.pattern.behavior.observe;

import com.google.common.eventbus.Subscribe;

/**
 * Created by perl on 2019/7/3.
 */
public class Teacher {

    @Subscribe
    public void subscribe(Student student) {
        System.out.println("收到"+student.getName()+"的一条邮件,内容是:"+student.getMsg());
    }
}
