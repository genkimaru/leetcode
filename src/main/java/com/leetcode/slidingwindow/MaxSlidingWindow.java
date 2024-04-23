package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.function.IntFunction;

public class MaxSlidingWindow {


    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0 , j= k -1; j < nums.length ; i++ , j++){
            int max = Integer.MIN_VALUE;
            for(int x = i ; x <= j ; x ++){
                if(nums[x] > max){
                    max = nums[x];
                }
            }
            result.add(max);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

       int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] ints = new MaxSlidingWindow().maxSlidingWindow(nums, k);
        for(int i : ints){
            System.out.println(i);
        }
    }
}
