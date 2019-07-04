package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 */
public class CTOApprover extends Approver {
    @Override
    public void approval(WorkPlan workPlan) {
        String content = workPlan.getContent();
        if (content != null && content != ""){
            System.out.println("ID:"+workPlan.getId()+"含有内容,审批成功");
            if (approver != null) {
                approver.approval(workPlan);
            }
        }else {
            System.out.println("ID:"+workPlan.getId()+"不含有内容,流程终止");
            return;
        }
    }
}
