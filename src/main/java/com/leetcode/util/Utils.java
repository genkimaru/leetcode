package com.leetcode.util;

import com.leetcode.Practice9;

public class Utils {

    /**
     *
     * @param arr
     * @return linked list's head node
     */
    public static ListNode buildList(int[] arr  ) {
        ListNode next = null;
        ListNode head = null;
        for(int i =0; i< arr.length-1; i++){
            if(i == 0) {
                head = new ListNode(arr[i]);
                next = new ListNode(arr[i+1]);
                head.next = next;
            }else{
                ListNode current = next;
                current.next = new ListNode(arr[i+1]);
                next = current.next;
            }
        }
        return head;
    }
}
