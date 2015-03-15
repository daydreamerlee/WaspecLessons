package org.waspec.lesson019;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2015/3/6.
 */
public class TreeTraversal {
    public static void main(String[] args){
        TreeNode testTree = constructTree();//construct a testTree
//        BFT(testTree);// BFT
//        preOrderDFT(testTree);
//        inOrderDFT(testTree);
        postOrderDFT(testTree);
    }

    public static void preOrderDFT(TreeNode root){
        TreeNode node = root;
        if(node == null){
            return;
        }
        preOrderDFT(node.leftChild);
        System.out.println(node.getPayload());
        preOrderDFT(node.rightChild);
    }

    public static void inOrderDFT(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.getPayload());
        inOrderDFT(root.leftChild);
        inOrderDFT(root.rightChild);
    }

    public static void postOrderDFT(TreeNode root){
        if(root == null){
            return;
        }
        postOrderDFT(root.leftChild);
        postOrderDFT(root.rightChild);
        System.out.println(root.getPayload());
    }

    public static void BFT(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>(); //声明一个queue用来装节点
        queue.offer(root);
        while (queue.peek()!=null){
            TreeNode popOutNode=queue.poll();
            System.out.println(popOutNode.getPayload());
            queue.offer(popOutNode.leftChild);
            queue.offer(popOutNode.rightChild);
        }
}

    public static TreeNode constructTree() {
        TreeNode root = new TreeNode(1);

        root.leftChild = new TreeNode(2);
        root.rightChild = new TreeNode(3);

        root.leftChild.leftChild = new TreeNode(4);
        root.leftChild.rightChild = new TreeNode(5);

        root.rightChild.leftChild = new TreeNode(6);
        root.rightChild.rightChild = new TreeNode(7);
        return root;
    }

}
