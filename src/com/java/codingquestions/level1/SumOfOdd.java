package com.java.codingquestions.level1;

import java.util.Scanner;
//8.sum of odd numbers between 1 to N
public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int oddSum = 0;
        int i = 1;
        while (i <= N) {
            if (i % 2 != 0) {
                System.out.println(i);
                oddSum = oddSum + i;
            }
            i = i + 1;
        }
        System.out.println("Their sum : ");
        System.out.println(oddSum);
        sc.close();
    }

}


