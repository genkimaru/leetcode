package com.leetcode.stack;

import java.util.Stack;

/**
 *
 * Is Valid Perentheses
 *
 * using stack data structure
 */
public class CheckPerentheses {


    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '{' | c == '[' | c == '('){
                stack.push(c);
            }
            if(c == '}' | c == ']' | c == ')'){
                if(stack.isEmpty()){
                    return false;
                }
                Character c2 = stack.pop();
                if( !(c2 == '{' & c == '}') && !(c2 == '[' & c == ']') && !(c2 == '(' & c == ')') ){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "{(abc+bcd)*[cc+dd]}";
        boolean isvalid = new CheckPerentheses().isValid(s);
        System.out.println(isvalid);
    }
}
