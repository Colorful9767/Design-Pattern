package com.design.pattern.behavior.memento;

/**
 * Created by perl on 2019/7/3.
 * 文档快照类
 */
public class WordDocSnapshot {
    private String title;
    private String content;

    public WordDocSnapshot(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }
}
