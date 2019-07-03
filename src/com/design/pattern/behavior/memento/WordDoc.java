package com.design.pattern.behavior.memento;

/**
 * Created by perl on 2019/7/3.
 */
public class WordDoc {

    private String title;
    private String content;

    public WordDoc(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public WordDocSnapshot saveToSnapshot() {
        return new WordDocSnapshot(this.title,this.content);
    }

    public void undoFormSnapshot(WordDocSnapshot snapshot) {
        this.title = snapshot.getTitle();
        this.content = snapshot.getContent();
    }

    @Override
    public String toString() {
        return "WordDoc{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
