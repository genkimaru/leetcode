package com.leetcode;

public class Practice3 {

    /**
     *
     * merge [1,2,3,0,0,0] and [2,5,8]  => [1,2,2,3,5,8]
     *
     */
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,0,0,0};
        int[] arr2 = new int[]{2,5,8};

        int m = arr2.length;
        int n = arr1.length - m;

        int[] temp = new int[arr1.length];

        // double pointer
        for(int i = 0 ,j = 0 , k = 0; k < temp.length ; ){
            if(i == n  ){
                while(j < m ){
                    temp[k] = arr2[j];
                    j++;
                    k++;
                }
                break;
            }
            if(arr1[i] < arr2[j]){
                temp[k] = arr1[i];
                i ++;
                k++;
            }else if(arr1[i] > arr2[j]){
                temp[k] = arr2[j];
                j++;
                k++;
            }else{
                temp[k] = arr1[i];
                i ++;
                k++;
                temp[k] = arr2[j];
                j++;
                k++;
            }

        }

        for(int ele : temp){
            System.out.println(ele);
        }

    }
}
