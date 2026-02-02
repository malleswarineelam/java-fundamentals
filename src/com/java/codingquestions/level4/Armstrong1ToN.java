package com.java.codingquestions.level4;

import java.util.Scanner;
//35.Print All Armstrong Numbers All 1 to N
public class Armstrong1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int num = i;
            int temp = i;
            int count = 0;
            int sum = 0;

            // count number of digits
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }

            temp = num;

            // calculate sum of digits^count
            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int j = 1; j <= count; j++) {
                    power = power * digit;
                }

                sum = sum + power;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
            sc.close();
        }
    }
}
