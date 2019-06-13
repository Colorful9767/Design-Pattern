package com.design.pattern.creational.prototype.deepClone;

import java.util.Date;

/**
 * Created by perl on 2019/6/13.
 * 实现深克隆
 * 即对象里面的属性也要是一个新的副本
 */
public class Pig implements Cloneable {

    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        Date copyDate = (Date) pig.getBirthday().clone();
        pig.setBirthday(copyDate);

        return pig;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Pig p1 = new Pig();
        p1.setName("Peppa Pig");
        p1.setBirthday(new Date(0L));

        Pig p2 = (Pig) p1.clone();

        p1.setBirthday(new Date(7777777777777L));

        System.out.println(p1);
        System.out.println(p2);
    }
}
