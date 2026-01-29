package com.java.codingquestions.level3;

import java.util.Scanner;
//LCM OF 2 NUMBERS
public class LcmOf2Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2 = sc.nextInt();
        int a=num1;
        int b=num2;
        //Euclid method
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("GCD OF 2 NUMBERS : " + a);
        int lcm=(num1*num2)/a;
        System.out.println("LCM OF 2 NUMBERS : " + lcm);

        sc.close();
    }
}
