package com.design.pattern.creational.prototype;

/**
 * Created by perl on 2019/6/13.
 * 原型模式实现
 * 该模式的特点是让原本复杂的创建过程简单
 * 减少创建对象的开销
 * 以邮件为例
 */
public class Email implements Cloneable{

    private String name;
    private String emailAddr;
    private String emailContent;

    public Email() {
        System.out.println("invoke Email class constructor method");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent;
    }

    @Override
    public String toString() {
        return "Email{" +
                "name='" + name + '\'' +
                ", emailAddr='" + emailAddr + '\'' +
                ", emailContent='" + emailContent + '\'' +
                '}';
    }

    /**
     * 实现原型模式的关键是
     * 让对象可以被拷贝,即实现Cloneable接口,并重写clone()方法
     * @return
     */
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("deepClone Email Object error!!");
            e.printStackTrace();
        }
        return null;
    }
}
