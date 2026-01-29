package com.java.codingquestions.level3;

import java.util.Scanner;

//30.Check whether number is spy number or not
// a spy number means is a positive number whose sum of digits must be equal to product of digits
//ex:123 -----  1+2+3=1*2*3=6
//Spy number
public class CheckSpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        int product = 1;
        int digit;
        while (N > 0) {
            digit = N % 10;
            sum = sum + digit;
            product = product * digit;
            N = N / 10;
        }
        if (sum == product) {
            System.out.println("Spy Number");
        } else {
            System.out.println("Not a Spy Number");
        }
        sc.close();
    }
}
