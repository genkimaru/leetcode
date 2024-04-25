package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MinWindow {


    /**
     *   算法介绍：
     *   设置一个targetmap来存放 目标字符串t的 字符和个数。
     *   设置左右两个指针，开始都指向s字符数组的左端。
     *   首先，right指针从左向右移动，直到发现了所有的目标字符，记录一个minlen， minstart。
     *  关键步骤-A） 此时，right停止，而left开始从左向右移动，直到读到第一个目标字符中的任意一个字符， 比如字符a，停止下来。
     *  关键步骤-B） 此时，right开始继续走，1）直到读到left读到的那个字符，比如字符a， 停止下来；
     *          2）如果没有读到该字符，right指针到达了字符串长度，从而停止循环，返回结果；
     *   若1）继续执行关键步骤A->关键步骤B，直到退出循环。
     *
     */

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

        String str = "axxxxxbcxbxxxxbc";
        String substr = "abc";
        String s = new MinWindow().minWindow(str, substr);
        System.out.println(s);

    }
}
