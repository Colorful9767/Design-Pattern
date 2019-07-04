package com.design.pattern.behavior.chainofresponsibility;

/**
 * Created by perl on 2019/7/4.
 * 审批实体类
 */
public class WorkPlan {
    private Long id;
    private String organizer;
    private String time;
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
