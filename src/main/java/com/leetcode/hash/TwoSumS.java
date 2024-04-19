package com.leetcode.hash;

import java.util.HashMap;
import java.util.Map;

public class TwoSumS {

    public int[] twoSun(int[] nums , int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2,5,7,9};
        int[] ints = new TwoSumS().twoSun(arr, 7);
        for(int i : ints){
            System.out.println(i);
        }

    }
}
