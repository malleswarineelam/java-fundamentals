package com.java.codingquestions.level4;
//39.Generate Series 1, 11, 111, 1111, ... (Using Loops)

import java.util.Scanner;

public class OnesSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int num = 0;

        for (int i = 1; i <= n; i++) {
            num = num * 10 + 1;
            System.out.print(num + " ");
        }
        sc.close();
    }
}

