package com.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrangementTest {

    @Test
    public void restOfArrTest(){
        int[] arr = new int[]{1,2,3,4,5,6};
        int[] restOfArr = new Arrangement().restOfArr(1, arr);
        Assertions.assertArrayEquals(new int[]{2,3,4,5,6} , restOfArr);
    }


}