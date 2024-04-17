package com.leetcode.util;


/**
 * Binary search tree
 *
 * `recursion` algorithm
 */

public class BinarySearchTree {


    public static TreeNode buildBST(int[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        for (int ele : arr) {
            compareAndAdd(root, new TreeNode(ele));
        }
        return root;
    }

    private static void compareAndAdd(TreeNode root, TreeNode node) {
        if (node.val > root.val) {
            if (root.right == null) {
                root.right = node;
            } else {
                compareAndAdd(root.right, node);
            }
        } else if (node.val < root.val) {
            if (root.left == null) {
                root.left = node;
            } else {
                compareAndAdd(root.left, node);
            }
        } else {
            System.out.println("have the same one , drop " + node.val);
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 3, 1, 5, 7, 6,9,8};
        TreeNode root = buildBST(arr);
        inorderTraversal(root);

    }

    private static void inorderTraversal(TreeNode root) {
        if (root.left != null) {
            inorderTraversal(root.left);
        }
        System.out.println(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }


    }


}
