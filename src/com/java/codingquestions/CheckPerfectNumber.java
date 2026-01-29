package com.java.codingquestions;

import java.util.Scanner;
//24.check whether a number is perfect number or not
// perfect number means sum of its perfect divisors not the number should equal to the numner
//ex:6 (1,2,3) 1+2+3=6
//perfect number

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == N) {
            System.out.println("Perfect Number");
        } else {
            System.out.println(" Not a Perfect Number");
        }
        sc.close();

    }
}