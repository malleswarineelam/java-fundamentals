package com.java.codingquestions.level4;
//34.find the sum of factorial of its digit

import java.util.Scanner;

public class SumOfDigitFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;

            // calculate factorial using loop
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        System.out.println("Sum of factorial of digits: " + sum);
        sc.close();
    }
}
