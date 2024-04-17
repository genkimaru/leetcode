package com.leetcode.linkedlist;

import com.leetcode.util.ListNode;
import com.leetcode.util.Utils;

/**
 *  name:  two intersect list
 */
public class LinkedListOne {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentNodeA = null;
        ListNode currentNodeB = null;
        for (int i = 1; i <= this.skipA; i++) {
            if(i == 1){
                currentNodeA = headA.next;
            }else{
                currentNodeA = currentNodeA.next;
            }

        }
        for (int i = 1; i <= this.skipB; i++) {
            if(i == 1){
                currentNodeB = headB.next;
            }else{
                currentNodeB = currentNodeB.next;
            }
        }
        if (currentNodeA != null && currentNodeB != null && currentNodeA.val == currentNodeB.val) {
            return currentNodeA;
        } else {
            return null;
        }


    }

    public static void main(String[] args) {

        int[] listA = {4, 1, 8, 4, 5};
        int[] listB = {5, 6, 1, 8, 4, 5};

        //  expect : int intersectVal = 8;
        LinkedListOne practice9 = new LinkedListOne();
        practice9.listAHead = Utils.buildList(listA);
        practice9.listBHead = Utils.buildList(listB );
        ListNode intersectionNode = practice9.getIntersectionNode(practice9.listAHead, practice9.listBHead);
        if (intersectionNode != null) {
            System.out.println(intersectionNode.val);
        } else {
            System.out.println("null");
        }
    }

    private ListNode listAHead;
    private ListNode listBHead;

    private int skipA = 2;
    private int skipB = 3;


}
