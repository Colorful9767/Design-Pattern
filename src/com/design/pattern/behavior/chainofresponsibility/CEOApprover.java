package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 */
public class CEOApprover extends Approver {

    @Override
    public void approval(WorkPlan workPlan) {
        String organizer = workPlan.getOrganizer();
        if (organizer != null && organizer != ""){
            System.out.println("ID:"+workPlan.getId()+"含有发起人,审批成功");
            if (approver != null) {
                approver.approval(workPlan);
            }
        }else {
            System.out.println("ID:"+workPlan.getId()+"不含有发起人,流程终止");
            return;
        }
    }
}
