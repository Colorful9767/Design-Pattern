package com.design.pattern.behavior.templatemethod;

/**
 * Created by perl on 2019/7/1.
 */
public abstract class AFriedRice {
    /**
     * 规定整个类的执行框架
     * 指定为final不允许子类修改
     */
    protected final void friedRice() {
        this.addRice();
        if (isVegetarian()) {
            this.addVege();
        }
        this.addMainFood();
        this.addSeason();
    }

    private final void addRice() {
        System.out.println("放入米饭");
    }

    private final void addSeason() {
        System.out.println("放入调味品");
    }

    private final void addVege() {
        System.out.println("放入蔬菜");
    }

    /**
     * 钩子方法
     * @return
     */
    protected boolean isVegetarian() {
        return false;
    }

    abstract void addMainFood();

}
