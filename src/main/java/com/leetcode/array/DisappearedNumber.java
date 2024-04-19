package com.leetcode.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.List;

public class DisappearedNumber {
    /**
     *
     * find the disappeared numbers in array
     *
     * [2,1,4,6,4,3,7,8]  =>  5
     */

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 1 ; i <= arr.length  ; i++){
            map.put(i , false);
        }

        for (int i : arr){
            map.put(i , true);
        }

        List<Integer> result = new ArrayList<Integer>();
        map.forEach(new BiConsumer<Integer, Boolean>() {
            @Override
            public void accept(Integer integer, Boolean aBoolean) {
                if(!aBoolean){
                    result.add(integer);
                }
            }
        });
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,4,3,7,8};
        List<Integer> disappearedNumbers = findDisappearedNumbers(arr);
       for(Integer i : disappearedNumbers){
           System.out.println(i);
       }

    }
}
