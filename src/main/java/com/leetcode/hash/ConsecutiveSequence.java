package com.leetcode.hash;

import java.util.*;

public class ConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        // sort the array using Arrays.sort()
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == 1) {
                count++;
            } else {
                // record last max count.
                max = Math.max(max, count);
                count = 1;
            }
        }
        return Math.max(max, count);
    }


    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};
        int i = new ConsecutiveSequence().longestConsecutive(nums);
        System.out.println(i);
    }
}
