package com.java.codingquestions.level4;
//36.Print Palindrome Numbers from 1 to N
import java.util.Scanner;
public class Palindrome1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i;
            int rev = 0;

            // reverse the number
            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (rev == i) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}


