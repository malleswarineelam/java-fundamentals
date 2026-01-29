package com.java.codingquestions.level1;

import java.util.Scanner;

//1.print numbers from 1 to N
public class Numbers1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int num = 1;
        while (num <= N) {
            System.out.println(num);
            num=num+1;
            sc.close();

        }
    }
}
