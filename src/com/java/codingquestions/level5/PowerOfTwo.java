package com.java.codingquestions.level5;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is NOT a power of 2");
        }
    }
}

