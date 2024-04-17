package com.leetcode.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursionOneS {


    public static void main(String[] args) {
        String s = "abc";
        RecursionOneS recursionOneS = new RecursionOneS();
        List<String> result = new ArrayList<>();
        recursionOneS.permutate(s, "", result);
        for (String ele : result) {
            System.out.println(ele);
        }
    }

    private void permutate(String s, String prefix, List<String> result) {

        if (s.isEmpty()) {
            result.add(prefix);
        }
        for (int i = 0; i < s.length(); i++) {
            permutate(s.substring(0, i) + s.substring(i + 1), prefix + String.valueOf(s.charAt(i)), result);
        }

    }
}
