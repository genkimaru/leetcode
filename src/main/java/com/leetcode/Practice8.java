package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class Practice8 {

    public void setZeroes(int[][] matrix) {

        // set the all element as zero in that row .
        // get the index in the row , set all elements in that index as zero.

        for (int i = 0; i < matrix.length; i++) {
            detectZero(matrix[i], i);
        }

        for (int i = 0; i < matrix.length; i++) {
            if (zeroRows.contains(i)) {
                setZero(matrix[i]);
            } else {
                setZeroInColumn(matrix[i]);
            }
        }

    }

    private void setZeroInColumn(int[] row) {
        for (int j : zeroColumns) {
            row[j] = 0;
        }
    }

    private void setZero(int[] row) {
        for (int i = 0; i < row.length; i++) {
            row[i] = 0;
        }
    }

    private ArrayList<Integer> zeroRows = new ArrayList<>();
    private ArrayList<Integer> zeroColumns = new ArrayList<>();

    private void detectZero(int[] row, int rowIndex) {

        for (int i = 0; i < row.length; i++) {
            if (row[i] == 0) {
                zeroRows.add(rowIndex);
                zeroColumns.add(i);
            }
        }

    }


    public static void main(String[] args) {
        //int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        // int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] matrix = {{1, 0}};
        new Practice8().setZeroes(matrix);
        for (int[] row : matrix) {
            System.out.print("[ ");
            for (int element : row) {
                System.out.print(element + "  ");
            }
            System.out.println(" ], ");
        }

    }
}


