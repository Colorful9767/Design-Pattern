package com.design.pattern.structural.adapter.example;

/**
 * Created by perl on 2019/6/18.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        int ac = 200;
        DC adapter = new PowerAdapter(ac);
        System.out.println("使用PowerAdapter,输入AC: "+ ac +"V,输出DC: "+ adapter.outputDC5V() +"V");
    }
}
