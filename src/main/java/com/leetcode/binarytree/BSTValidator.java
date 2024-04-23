package com.leetcode.binarytree;


import com.leetcode.util.BinarySearchTree;
import com.leetcode.util.TreeNode;


public class BSTValidator {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode node, long min, long max) {
        if (node == null) {
            return true;
        }
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return  validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1, 6};


        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(5);
        node1.right = node2;
        node2.left = node3;

        TreeNode root = BinarySearchTree.buildBST(arr);
        boolean validBST = new BSTValidator().isValidBST(node1);
        System.out.println(validBST);
    }
}
