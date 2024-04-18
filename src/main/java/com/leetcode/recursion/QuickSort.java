package com.leetcode.recursion;
import java.util.Random;

/**
 * pivot  :   either using a random number of the array , or using a high
 */
public class QuickSort {

    void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int split = partition(arr, low, high);
            quickSort(arr, 0, split - 1);
            quickSort(arr, split, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // choose  pivot
        int randomInt = new Random().nextInt(high-low);
        int pivot = arr[low + randomInt];

        // init double point left , right
        int left = low - 1;
        int right = high + 1;

        // ensure the all number on left be less than pivot
        // ensuer the all number on right be greater than pivot
        // if not , swap the number on the both sides
        while (true) {
            while (true) {
                left += 1;
                if (left > high || arr[left] >= pivot) {
                    break;
                }
            }
            while (true) {
                right -= 1;
                if (right < low || arr[right] <= pivot) {
                    break;
                }
            }
            if (left > right) {
                break;
            }
            // swap
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        // return the split position.
        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 7, 8, 5, 6, 1, 2, 9};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
