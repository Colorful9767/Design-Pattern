package com.design.pattern.structural.flyweight;

/**
 * Created by perl on 2019/6/19.
 * 测试类
 */
public class Test {

    private final static String Departments[] = {"RD","QA","PM","BD"};

    public static void main(String[] args) {
        for (int i = 0;i < 10;i++){
            Manager manager = (Manager) EmployeeFactory.getEmployee(Departments[(int) (Math.random()*Departments.length)]);
            manager.report();
        }
    }
}
