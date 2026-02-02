package com.java.codingquestions.level4;

import java.util.Scanner;

//33.print numbers whose product of its digits is odd
public class OddDigitProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int num = i;
            boolean allDigitsOdd = true;

            while (num > 0) {
                int digit = num % 10;

                if (digit % 2 == 0) {   // even digit found
                    allDigitsOdd = false;
                    break;
                }

                num = num / 10;
            }

            if (allDigitsOdd) {
                System.out.print(i + " ");
            }
            sc.close();
        }
    }
}
