package com.leetcode.binarysearch;

public class BinarySearch {


    public int searchInsert(int[] arr , int target){
        int left = 0 , right = arr.length -1 ;
        while(left <= right){

            int mid = ( left + right ) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
               right = mid -  1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1,3,5,7 ,9};
        int target = 6;

        int index = new BinarySearch().searchInsert(nums , target);
        System.out.println(index);


    }
}
