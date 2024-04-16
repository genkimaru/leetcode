package com.leetcode;

public class Practice5_s {


    public static void main(String[] args) {
        int[] nums = {2,1,4,6,4,3,7,8};
        int n = nums.length;
        for (int num : nums) {
            int x = (num - 1) % n;
            nums[x] += n;
        }
        for(int ele : nums){
            System.out.println(ele);
        }

    }
}
