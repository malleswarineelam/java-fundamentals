package com.java.codingquestions.level4;

import java.util.Scanner;

//37.find the Nth Fibonacci number.
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int a = 0, b = 1, c = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci number: 0");
        } else if (n == 1) {
            System.out.println("Nth Fibonacci number: 1");
        } else {
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Nth Fibonacci number: " + c);
        }

        sc.close();
    }

}
