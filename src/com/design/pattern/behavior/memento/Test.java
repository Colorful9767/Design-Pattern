package com.design.pattern.behavior.memento;

/**
 * Created by perl on 2019/7/3.
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
        SnapshotManager snapshotManager = new SnapshotManager();
        WordDoc wordDoc = new WordDoc("未命名文档","啊啊啊啊啊啊啊啊啊啊啊");
        WordDocSnapshot snapshotA = wordDoc.saveToSnapshot();
        snapshotManager.saveSnapshot(snapshotA);

        wordDoc.setTitle("aaa");
        WordDocSnapshot snapshotB = wordDoc.saveToSnapshot();
        snapshotManager.saveSnapshot(snapshotB);

        wordDoc.setTitle("bbb");
        wordDoc.setContent("哇哇哇哇哇奥哇无");

        System.out.println("回退之前:");
        System.out.println(wordDoc);
        System.out.println("--------------------");
        wordDoc.undoFormSnapshot(snapshotManager.removeSnapshot());
        System.out.println("第一次回退:");
        System.out.println(wordDoc);
        System.out.println("--------------------");
        wordDoc.undoFormSnapshot(snapshotManager.removeSnapshot());
        System.out.println("第二次回退:");
        System.out.println(wordDoc);
    }
}
