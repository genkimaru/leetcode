package com.leetcode.linkedlist;

import com.leetcode.util.ListNode;
import com.leetcode.util.Utils;
import java.util.ArrayList;


/**
 *  merge two list
 */
public class MergeTwoList {

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ArrayList<Integer>  list = new ArrayList<Integer>();
        while(head1 != null && head2 != null){
            if(head2 == null || head1.val < head2.val){
                list.add(head1.val);
                head1 = head1.next;
            }else if( head1 == null || head1.val > head2.val){
                list.add(head2.val);
                head2 = head2.next;
            }else{
                list.add(head1.val);
                list.add(head2.val);
                head1 = head1.next;
                head2 = head2.next;
            }
        }
        ListNode head = Utils.buildList(list.stream().mapToInt(Integer::intValue).toArray());
        return head;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4}, arr2 = {1, 3, 4};
        ListNode head1 = Utils.buildList(arr1);
        ListNode head2 = Utils.buildList(arr2);
        ListNode newHead = new MergeTwoList().mergeTwoLists(head1, head2);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;

        }
    }
}
