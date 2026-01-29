package com.java.codingquestions.level1;

import java.util.Scanner;
//print each digit of a number
public class PrintDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int N = sc.nextInt();
        int digit;
        while (N > 0) {
            digit = N % 10;
            System.out.println(digit);
            N = N / 10;
        }
        sc.close();
    }
}
