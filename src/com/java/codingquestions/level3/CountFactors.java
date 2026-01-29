package com.java.codingquestions.level3;
//23.count no of factors of a number
import java.util.Scanner;

public class CountFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count = count + 1;
            }
        }
        System.out.println("count of factors of given number:" + count);
        sc.close();
    }
}