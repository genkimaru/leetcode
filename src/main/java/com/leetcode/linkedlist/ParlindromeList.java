package com.leetcode.linkedlist;

import com.leetcode.util.ListNode;

import java.util.List;
import java.util.Stack;

public class ParlindromeList {

    public boolean isPalindrome(ListNode head) {
        int len = 1;
        ListNode curnode = head;
        while(curnode.next != null){
            len++;
            curnode = curnode.next;
        }
        if(len % 2 == 1){
            return false;
        }else{
            int i = 0;
            curnode = head;
            Stack<Integer> stack = new Stack<Integer>();
            while( i < len / 2){
                stack.push(curnode.val);
                curnode = curnode.next;
                i++;
            }

            while(i < len){
                Integer pop = stack.pop();
                if(pop != curnode.val){
                    return false;
                }
                curnode = curnode.next;
                i++;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        boolean b = new ParlindromeList().isPalindrome(node1);
        System.out.println(b);

    }
}
