package com.leetcode.stack;
import java.util.Stack;

/**
 *
 *  double push
 */
class  MinStackSS {
    Stack<Integer> stack = new Stack<Integer>();

    public void push ( int x){
        if (stack.isEmpty()) {
            stack.push(x);
            stack.push(x);
        } else {
            int tmp = stack.peek();
            stack.push(x);
            if (tmp < x) {
                stack.push(tmp);
            } else {
                stack.push(x);
            }
        }
    }

    public void pop () {
        stack.pop();
        stack.pop();
    }

    public int top () {
        return stack.get(stack.size() - 2);
    }

    public int getMin () {
        return stack.peek();
    }


    public static void main(String[] args) {
        MinStackSS minStack = new MinStackSS();
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
