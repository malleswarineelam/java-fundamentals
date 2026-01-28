package com.java.codingquestions;

import java.util.Scanner;

//16.Smallest digit in a Number
public class SmallestDigitOFN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N : ");
        int N = sc.nextInt();
        int digit;
        int minDigit = 9;
        while (N > 0) {
            digit = N % 10;
            if (digit < minDigit) {
                minDigit = digit;
            }
            N = N / 10;
        }
        System.out.println("the smallest digit in the given number is :  " + minDigit);
        sc.close();
    }
}
