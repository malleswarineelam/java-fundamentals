package com.java.codingquestions.level2;

import java.util.Scanner;
//19.Check whether a number is prime number
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N : ");
        int N = sc.nextInt();
        if (N <= 1) {
            System.out.println("Not a prime Number");
        }
        int flag = 1;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                flag = 0;
                break;
            }

        }
        if (flag == 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a prime Number");
        }
    }
}
