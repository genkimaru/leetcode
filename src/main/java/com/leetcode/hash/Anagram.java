package com.leetcode.hash;

import java.sql.Array;
import java.util.*;

/**
 *
 *
 * keyword :  hash , group
 */

public class Anagram {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  result = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String sortedStr = String.valueOf(temp);
            Set<String> set = map.keySet();

            if(set.contains(sortedStr)){
                map.get(sortedStr).add(strs[i]);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(sortedStr , list );
            }
        }
        result.addAll(map.values());
        return result;
    }


    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = new Anagram().groupAnagrams(strs);
    }
}
