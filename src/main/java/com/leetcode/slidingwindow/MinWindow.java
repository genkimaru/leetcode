package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {


    public String minWindow(String s, String t) {
            Map<Character, Integer> targetMap = new HashMap<>();
            for (char c : t.toCharArray()) {
                targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
            }

            int left = 0, right = 0;
            int minLen = Integer.MAX_VALUE;
            int minStart = 0;
            int count = t.length();

            while (right < s.length()) {
                char c = s.charAt(right);
                if (targetMap.containsKey(c)) {
                    if (targetMap.get(c) > 0) {
                        count--;
                    }
                    targetMap.put(c, targetMap.get(c) - 1);
                }

                while (count == 0) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minStart = left;
                    }

                    char leftChar = s.charAt(left);
                    if (targetMap.containsKey(leftChar)) {
                        targetMap.put(leftChar, targetMap.get(leftChar) + 1);
                        if (targetMap.get(leftChar) > 0) {
                            count++;
                        }
                    }

                    left++;
                }

                right++;
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }


    public static void main(String[] args) {

        String str = "ADOBECODEBANC";
        String substr = "ABC";
        String s = new MinWindow().minWindow(str, substr);
        System.out.println(s);

    }
}
