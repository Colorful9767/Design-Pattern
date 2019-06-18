package com.design.pattern.structural.adapter.example;

/**
 * Created by perl on 2019/6/18.
 * 电源适配器
 */
public class PowerAdapter implements DC {
    private AC ac;

    public PowerAdapter(int ac) {
        this.ac = new AC(ac);
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac.outputAC200V();
        //  模拟变压器电流转换 AC -> DC
        int adapterOutput = adapterInput / 44;
        return adapterOutput;
    }
}
