package com.java.codingquestions.level2;
//12.sum of digits of a number

import java.util.Scanner;

public class DigitsSumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int sum = 0;
        int digit;
        while (N > 0) {
            digit = N % 10;
            sum = sum + digit;
            N = N / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
