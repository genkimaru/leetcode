package com.leetcode;

import java.io.IOException;
import java.util.Scanner;


/**
 *
 *  fibonacci sequence / go upstairs 1/2 steps
 */
public class Practice1 {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("must great than 0");
            int n = scanner.nextInt();
            if (n < 1) {
                System.out.println("must great than 0");
                scanner.close();
                System.exit(-1);
            } else {
                System.out.println(fibonacci(n));
            }
        }

    }


}
