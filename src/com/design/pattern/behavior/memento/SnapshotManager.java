package com.design.pattern.behavior.memento;

import java.util.Stack;

/**
 * Created by perl on 2019/7/3.
 */
public class SnapshotManager {
    private Stack<WordDocSnapshot> SNAPSHOT_STACK = new Stack<>();

    public void saveSnapshot(WordDocSnapshot snapshot){
        SNAPSHOT_STACK.push(snapshot);
    }

    public WordDocSnapshot removeSnapshot() {
        return SNAPSHOT_STACK.pop();
    }

}
