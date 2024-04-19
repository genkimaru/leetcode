package com.leetcode.hash;

/**
 * two sum
 * arr = [2 , 7, 9 , 11 ] , target number 9
 * arr[0] + arr[1] = 9
 */

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length - 1 ; i ++){
            for (int j = i + 1 ; j < nums.length ; j ++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return new int[]{i , j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int target = 9;
        int[] arr = {2, 7, 9, 11};
        int[] ints = new TwoSum().twoSum(arr, target);
        for(int i : ints){
            System.out.println(i);
        }
    }
}


