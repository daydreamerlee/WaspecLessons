package org.waspec.lesson019;

/**
 * Created by Administrator on 2015/3/6.
 */
public class TreeNode {
    private int payload;

    public TreeNode(int payload) {
        this.payload = payload;
    }

    public TreeNode leftChild,rightChild;

    public int getPayload() {
        return this.payload;
    }
}
