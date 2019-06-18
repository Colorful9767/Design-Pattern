package com.design.pattern.structural.adapter.example;

/**
 * Created by perl on 2019/6/18.
 * 交流电对象 AC
 */
public class AC {

    private final int AC;

    public AC(int ac) {
        this.AC = ac;
    }

    public int outputAC200V() {
        return AC;
    }
}
