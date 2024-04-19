package com.leetcode.binarysearch;


/**
 *     Search a 2D Matrix
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int targetRow = searchRow(matrix, target, rows, columns);
        if(targetRow == -1 ){
            return true;
        }else if(targetRow >= rows){
            return false;
        } else{
            return searchTarget(matrix[targetRow] , target);
        }
    }

    private boolean searchTarget(int[] arr, int target) {
        int left = 0 , right = arr.length -1 ;
        while(left <= right){

            int mid = ( left + right ) / 2;
            if(arr[mid] == target){
                return true;
            }else if(target < arr[mid]){
                right = mid -  1;
            }else{
                left = mid + 1;
            }
        }
        return false;
    }

    private  int  searchRow(int[][] matrix, int target, int rows, int columns) {
        int left = 0 , right = rows -1;
        while(left <= right){
            int mid = (left + right) / 2;
            // if can search directly in the row end number, pass -1 to identify it can be searched.
            if(target == matrix[mid][columns - 1] ){
                return -1;
            }
            else if(target > matrix[mid][columns - 1]  ){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 2;
        boolean b = new SearchMatrix().searchMatrix(matrix, target);
        System.out.println(b);
    }
}
