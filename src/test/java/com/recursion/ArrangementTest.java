package com.recursion;

import com.leetcode.recursion.RecursionOne;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class RecursionOneTest {

    @Test
    public void restOfArrTest(){
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] restOfArr = new RecursionOne().restOfArr(1, arr);
        Assertions.assertArrayEquals(new int[]{2,3,4,5,6} , restOfArr);
    }


}