package com.java.codingquestions.level4;
//31.Print the sum of digits until single digit(digital root)
//ex:1435=1+4+3+5=13 -----> 1+3=4 ans=4 since 4 is single digit

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num >= 10) {   // repeat until single digit
            int sum = 0;

            while (num > 0) {
                sum = sum + (num % 10);
                num = num / 10;
            }

            num = sum;
        }

        System.out.println("Digital Root: " + num);
        sc.close();
    }
}
