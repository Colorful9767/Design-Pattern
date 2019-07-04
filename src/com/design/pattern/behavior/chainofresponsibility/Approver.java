package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 * 抽象审批类
 */
public abstract class Approver {
    /**
     * 实现责任链模式的核心 定义一个供子类访问的Approver对象
     */
    protected Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void approval(WorkPlan workPlan);
}
