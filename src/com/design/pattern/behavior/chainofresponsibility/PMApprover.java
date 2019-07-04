package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 */
public class PMApprover extends Approver {
    @Override
    public void approval(WorkPlan workPlan) {
        String time = workPlan.getTime();
        if (time != null && time != ""){
            System.out.println("ID:"+workPlan.getId()+"含有发起时间,审批成功");
            if (approver != null) {
                approver.approval(workPlan);
            }
        }else {
            System.out.println("ID:"+workPlan.getId()+"不含有发起时间,流程终止");
            return;
        }
    }
}
