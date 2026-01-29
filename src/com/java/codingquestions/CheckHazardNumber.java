package com.java.codingquestions;

import java.util.Scanner;

//29.Check whether number is hazard number or not
// a hazard number means is a positive number whose sum of digits must be divisible by Number
//ex:18 (1,8) 1+8=9 9 divisible is 18
//hazard number
public class CheckHazardNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int sum = 0;
        int digit;
        int temp = N;
        while (temp > 0) {
            digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }
        if (N % sum == 0) {
            System.out.println("Hazard Number");
        } else {
            System.out.println(" Not a Hazard Number");
        }
        sc.close();

    }
}
