package com.java.codingquestions;

import java.util.Scanner;

//17.Largest digit in a Number
public class LargestDigitOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N : ");
        int N = sc.nextInt();
        int digit;
        int maxDigit = 0;
        while (N > 0) {
            digit = N % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            N = N / 10;
        }
        System.out.println("the largest digit in the given number is :  " + maxDigit);
        sc.close();
    }
}

