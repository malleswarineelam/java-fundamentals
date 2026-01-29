package com.java.codingquestions;

import java.util.Scanner;

//28.print Fibonacci series up to N-Terms
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int first = 0;
        int second = 1;

        for (int i = 3; i <= N; i++) {
            int next = first + second;
            System.out.println(next);

            first = second;
            second = next;
        }
        sc.close();

    }
}
