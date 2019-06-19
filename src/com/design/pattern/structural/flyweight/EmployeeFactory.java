package com.design.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by perl on 2019/6/19.
 * 工厂类
 */
public class EmployeeFactory {

    private final static Map<String,Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getEmployee(String department) {
        Employee employee = EMPLOYEE_MAP.get(department);

        if (employee == null) {
            System.out.println("创建"+ department +"部门报告:");
            String reportContent = department + "部门报告内容为:......";
            employee = new Manager(department,reportContent);
            EMPLOYEE_MAP.put(department,employee);
        }

        return employee;
    }
}
