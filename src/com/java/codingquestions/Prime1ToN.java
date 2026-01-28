package com.java.codingquestions;

import java.util.Scanner;

//20.Print all the primes from 1 to N
public class Prime1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N : ");
        int N = sc.nextInt();
        for (int i = 2; i <= N; i++) {
            int flag = 1;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
