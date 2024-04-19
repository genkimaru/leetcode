package com.leetcode.binarytree;


import com.leetcode.util.BinarySearchTree;
import com.leetcode.util.TreeNode;


public class BSTValidator {

    public boolean isValidBST(TreeNode root) {
        if (root.left != null) {
            if (root.val < root.left.val) {
                return false;
            }
           return  isValidBST(root.left);

        }
        if (root.right != null) {

            if (root.val > root.right.val) {
                return false;
            }
          return   isValidBST(root.right);
        }
        return true;
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
