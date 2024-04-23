package com.leetcode.heap;


import java.util.Stack;

/**
 *   Kth Largest Element in an Array
 */
public class KthLargest {

    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;
        return i + 1;
    }

    public static int findKthLargest(int[] nums, int k) {
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[] {0, nums.length - 1});
        while (!stack.isEmpty()) {
            int[] bounds = stack.pop();
            int low = bounds[0];
            int high = bounds[1];
            int pivotIndex = partition(nums, low, high);
            if (pivotIndex == nums.length - k) {
                return nums[pivotIndex];
            } else if (pivotIndex < nums.length - k) {
                stack.push(new int[] {pivotIndex + 1, high});
            } else {
                stack.push(new int[] {low, pivotIndex - 1});
            }
        }
        // It's assumed that k is always valid and nums has at least k elements
        return -1; // Should never reach here
    }

    public static void main(String[] args) {

        int[] nums = new int[]{9,8,7,6,5,4,3,2,1};
        int k = 2;
        int kthLargest = new KthLargest().findKthLargest(nums, k);
        System.out.println(kthLargest);
    }
}
