package com.java.codingquestions.level2;

import java.util.Scanner;

//18.Count Even and Odd digits in a number
public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number N: ");
        int N = sc.nextInt();
        int countEven = 0;
        int countOdd = 0;
        int digit;
        while (N > 0) {
            digit = N % 10;
            if (digit % 2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
            N = N / 10;
        }
        System.out.println("Count of Even digits in a number : " + countEven);
        System.out.println("Count of Odd digits in a number : " + countOdd);
        sc.close();
    }

}
