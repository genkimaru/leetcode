package com.leetcode.doublepointer;

public class DoublePointerTwo {

    /** move zero
     *
     * [1, 3 ,0 ,4 ,0 ,2, 5] =>  [1,3,4,2,5,0,0]
     * require in-place sort
     */

    public static void main(String[] args) {
        int[] arr =  {1, 3 ,0 ,4 ,0 ,2, 5};
        for ( int i = arr.length -1 ; i >= 0; i --){
            if(arr[i] == 0 && i != arr.length -1 ){
                blockMove(arr , i+1 , arr.length -1 );
                arr[arr.length-1] = 0;
                opCount++;
            }
        }
        for(int ele : arr) {
            System.out.println(ele);
        }
        System.out.println(" total operation : " + opCount);
    }

private static int opCount = 0;
    public static void blockMove(int[] a , int i , int j){
        for(int x = i ; x <= j ; x ++){
            a[x-1] = a[x];
            opCount ++;
        }
    }
}
