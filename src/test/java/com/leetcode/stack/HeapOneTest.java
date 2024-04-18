package com.leetcode.stack;

import com.leetcode.heap.HeapOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HeapOneTest {

    @Test
    public void partitionTest(){
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int pivotIndex = HeapOne.partition(nums, 0, nums.length - 1);
        Assertions.assertEquals(pivotIndex , 8);
    }

}