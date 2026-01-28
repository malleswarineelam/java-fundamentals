package com.java.codingquestions;

import java.util.Scanner;

//21.factorial of a number
public class PrintFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int factorial = 1;
        if (N == 0)
            System.out.println(1);
        for (int i = 1; i <= N; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of given Number is : " + factorial);
        sc.close();

    }
}
