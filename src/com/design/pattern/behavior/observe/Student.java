package com.design.pattern.behavior.observe;

/**
 * Created by perl on 2019/7/3.
 */
public class Student {

    private String name;
    private String msg;

    public Student(String name, String msg) {
        this.name = name;
        this.msg = msg;
    }

    public String getName() {
        return name;
    }

    public String getMsg() {
        return msg;
    }
}
