package com.java.codingquestions.level1;
//5.Multiplication table of a number

import java.util.Scanner;

public class TableOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(N + " * " + i + " = " + N * i);
            i = i + 1;
        }
        sc.close();
    }}
