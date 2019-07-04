package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 */
public abstract class Approver {
    protected Approver approver;

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void approval(WorkPlan workPlan);
}
