package com.java.codingquestions.level5;

import java.util.Scanner;

//4.✅ Java Program: Find Duplicate Digits in a Number
public class DuplicateDigits {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter your number : ");
            int number = sc.nextInt();
            int[] count = new int[10];   // for digits 0–9

            while (number > 0) {
                int digit = number % 10;
                count[digit]++;
                number = number / 10;
            }

            System.out.print("Duplicate digits are: ");

            for (int i = 0; i < 10; i++) {
                if (count[i] > 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }

