package com.leetcode.linkedlist;

import com.leetcode.util.ListNode;
import com.leetcode.util.Utils;

import java.util.HashSet;

/**
 *  name:  two intersect list
 */
public class IntersectTwoList {

    //use hashset to store the node
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>() ;
        ListNode curNodeA = headA;
        int lenA = 0;
        while(curNodeA.next != null){
            set.add(curNodeA);
            lenA ++;
            curNodeA = curNodeA.next;
        }
        ListNode curNodeB = headB;
        int lenB = 0;
        while(curNodeB.next != null){
            boolean b = set.add(curNodeB);
            if(!b){
                return curNodeB;
            }
            lenB ++;
            curNodeB = curNodeB.next;

        }
        return null;
    }

    public static void main(String[] args) {

        // build linked list
        //  [4,1,8,4,5]
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        //    [5,6,1,8,4,5]
        ListNode node11 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node33 = new ListNode(1);
        //   ListNode node44 = new ListNode(8);
        ListNode node55 = new ListNode(4);
        ListNode node66 = new ListNode(5);

        node11.next = node22;
        node22.next = node33;
        node33.next = node3;
        node3.next = node55;
        node55.next = node66;


        ListNode intersectionNode =  new IntersectTwoList().getIntersectionNode(node1, node11);
        if (intersectionNode != null) {
            System.out.println(intersectionNode.val);
        } else {
            System.out.println("null");
        }
    }

}
