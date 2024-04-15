package com.leetcode;

import java.util.Arrays;

/**
 *
 *  arr = [2 , 7, 9 , 11 ] , target number 9
 *  arr[0] + arr[1] = 9
 */

public class Practice2 {



    public static void main(String[] args) {
        // first,  filter the array element which is greater than target number .

        // second, one number based on the largest number in the array,
        // the other one loop the array from smallest to largest , test the sum equals to the target number or not,
        //if the sum is greater than target number , then break the current loop.
        int target = 9;
        int[] arr =  {2,7,9,11};

        int[] newarr = new int[arr.length];
        for (int i =0 , j = 0 ;  i < arr.length ; i ++){
            if(target > arr[i]){
                newarr[j] = arr[i];
                j++;
            }
        }
        System.out.println(newarr.length);

        for(int i = newarr.length -1 ; i > 0 ; i --){
            for(int j = 0; j < newarr.length; j ++){
                if(newarr[i] + newarr[j] == target){

                    System.out.println("Found the index : " + i + " and " + j);
                    System.exit(0);
                }else if (newarr[i] + newarr[j] > target){
                    break;
                }

            }
        }



    }
}


