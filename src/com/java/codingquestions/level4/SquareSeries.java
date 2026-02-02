package com.java.codingquestions.level4;
//38.Generate a number series:1,4,9,16,.......

import java.util.Scanner;

public class SquareSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
        sc.close();
    }
}

