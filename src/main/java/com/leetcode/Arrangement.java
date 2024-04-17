package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * permutation or  arrangement problem: [1,2,3] => [1,2,3] [1,3,2] ,[2,1,3] ,[2,3,1],[3,1,2],[3,2,1]
 */
public class Arrangement {

    private int count;
    private ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    private HashMap<Integer, Integer> map = new HashMap<>();

    public void arrange(int[] arr) {

        if (arr.length > 2) {
            for (int ele : arr) {
                map.put(arr.length - 1, ele);
                arrange(restOfArr(ele, arr));
            }
        } else if (arr.length == 2) {
//            System.out.println(arr[0] + " , " + arr[1]);
//            System.out.println(arr[1] + " , " + arr[0]);
            map.put(1, arr[1]);
            map.put(0, arr[0]);
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = map.size() - 1; i >= 0; i--) {
                list.add(map.get(i));
            }
            result.add(list);
            map.put(1, arr[0]);
            map.put(0, arr[1]);
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = map.size() - 1; i >= 0; i--) {
                list2.add(map.get(i));
            }
            result.add(list2);
            count++;
            count++;
        }
    }

    protected int[] restOfArr(int ele, int[] arr) {
        int[] rest = new int[arr.length - 1];
        int i = 0;
        for (int e : arr) {
            if (ele == e) {
                continue;
            }
            rest[i] = e;
            i++;
        }
        return rest;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Arrangement arrangement = new Arrangement();
        arrangement.arrange(arr);
        arrangement.result.stream().forEach(new Consumer<ArrayList<Integer>>() {
            @Override
            public void accept(ArrayList<Integer> integers) {
                for (int i : integers) {
                    System.out.print(i + ", ");
                }
                System.out.println();
            }
        });
        System.out.println(arrangement.count);
    }
}
