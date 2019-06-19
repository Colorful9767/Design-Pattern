package com.design.pattern.structural.flyweight;

/**
 * Created by perl on 2019/6/19.
 * 部门经理类
 */
public class Manager implements Employee {
    private final String department;
    private final String reportContent;

    public Manager(String department, String reportContent) {
        this.department = department;
        this.reportContent = reportContent;
    }

    @Override
    public void report() {
        System.out.println(reportContent);
    }

}
