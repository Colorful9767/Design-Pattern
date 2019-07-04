package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 */
public class Test {

    public static void main(String[] args) {
        Approver ceoApprover = new CEOApprover();
        Approver ctoApprover = new CTOApprover();
        Approver pmApprover = new PMApprover();

        WorkPlan workPlan = new WorkPlan();
        workPlan.setId(111L);
        workPlan.setTime("2019-08-11");
        workPlan.setContent("本周计划收购阿里巴巴、谷歌。。。。。。。。。。");
        workPlan.setOrganizer("Perl");

        ctoApprover.setApprover(ceoApprover);
        pmApprover.setApprover(ctoApprover);

        pmApprover.approval(workPlan);

    }
}
