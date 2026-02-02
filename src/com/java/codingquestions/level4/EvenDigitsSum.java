package com.java.codingquestions.level4;

import java.util.Scanner;

//32.print numbers whose sum of digits is even
public class EvenDigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            int sum = 0;

            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }

            if (sum % 2 == 0) {
                System.out.print(i + " ");
            }
            sc.close();
        }
    }
}
