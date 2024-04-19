package com.leetcode.linkedlist;

import com.leetcode.util.ListNode;

public class IntersectTwoListS {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0, lenB = 0;
        while (curA != null) { // 求链表A的长度
            lenA++;
            curA = curA.next;
        }
        while (curB != null) { // 求链表B的长度
            lenB++;
            curB = curB.next;
        }
        curA = headA;
        curB = headB;
        // 让curA为最长链表的头，lenA为其长度
        if (lenB > lenA) {
            //1. swap (lenA, lenB);
            int tmpLen = lenA;
            lenA = lenB;
            lenB = tmpLen;
            //2. swap (curA, curB);
            ListNode tmpNode = curA;
            curA = curB;
            curB = tmpNode;
        }
        // 求长度差
        int gap = lenA - lenB;
        // 让curA和curB在同一起点上（末尾位置对齐）
        while (gap-- > 0) {
            curA = curA.next;
        }
        // 遍历curA 和 curB，遇到相同则直接返回
        while (curA != null) {
            if (curA == curB) {
                return curA;
            }
            curA = curA.next;
            curB = curB.next;
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

        ListNode intersectionNode = new IntersectTwoListS().getIntersectionNode(node1, node11);
        System.out.println(intersectionNode.val);

    }
}
