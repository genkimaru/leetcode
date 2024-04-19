package com.leetcode.slidingwindow;


/**
 * name :  longest substring  without repeating characters.
 *
 */
public class LongestSubstr {


    public static int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int startIdx = 0;
        String maxSubstring = "";
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            boolean isContain = s.substring(startIdx, i).contains(String.valueOf(c));
            if (isContain) {
                if (s.substring(startIdx, i).length() > maxSubstring.length()) {
                    maxSubstring = s.substring(startIdx, i);
                }
                startIdx = i;
            } else {
                maxSubstring = s.substring(startIdx, i + 1);
            }

        }
        System.out.println("maxsubstring: " + maxSubstring);
        return maxSubstring.length();
    }


    public static void main(String[] args) {

        //  String s = "abcabcbb";
        // String s = "pwwkew";
        //  String s = "abc";
        String s = "dvdf";
        int maxLength = lengthOfLongestSubstring(s);
        System.out.println(maxLength);

    }
}




