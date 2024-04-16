package com.leetcode;

public class Practice6 {
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
