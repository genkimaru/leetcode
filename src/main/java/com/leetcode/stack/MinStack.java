package com.leetcode.stack;


import java.util.Stack;

/**
 *
 *  double stack
 */
public class MinStack {
    private Stack<Integer> minStack;
    private Stack<Integer> mainStack;

    public MinStack() {
          minStack = new Stack<Integer>();
          mainStack = new Stack<Integer>();
    }

    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            Integer currentMin = minStack.peek();
            if(currentMin > val){
                minStack.push(val);
            }else{
                minStack.push(currentMin);
            }
        }

    }

    public void pop() {
         mainStack.pop();
         minStack.pop();
    }

    public int top() {
       return  mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(2);
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(1);

        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());

    }

}
