package com.leetcode.doublepointer;

public class DoublePointerOne {

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

    /**
     *
     * name: Container With Most Water
     *
     */
    public static class Practice6 {
        public static  int maxArea(int[] height) {
            int maxarea = 0;
            for(int i = 1 ; i < height.length ; i ++){
                for( int j = height.length -1 ; j > i ; j --){
                    int minHeight = Math.min(height[j], height[i]);
                    int area = (j-i) *  minHeight;
                    if(area > maxarea){
                        maxarea = area;
                    }
                }
            }

            return maxarea;
        }


        public static void main(String[] args) {
            // test case 1
            int[] height = {1,8,6,2,5,4,8,3,7};
            // test case 2
           //  int[] height = {1,1};
            int maxArea =  maxArea(height);
            System.out.println(maxArea);
        }
    }
}
