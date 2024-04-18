package com.leetcode.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTwoTest {

    @Test
    public void partitionTest(){
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        int pivotIndex = StackTwo.partition(nums, 0, nums.length - 1);
        Assertions.assertEquals(pivotIndex , 8);
    }

}