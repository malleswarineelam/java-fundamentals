package com.java.codingquestions.level1;

import java.util.Scanner;
//2.print numbers from N to 1
public class NumbersNTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int num = 1;
        while (N >= num) {
            System.out.println(N);
            N = N - 1;
            sc.close();

        }
    }
}
