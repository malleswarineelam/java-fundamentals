package com.java.codingquestions.patterns;

import java.util.Scanner;

public class PatternQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        while (n >= i) {
            int j = 1;
            while (n >= j) {
                System.out.print(" " + "*" + " ");
                j++;
            }
            System.out.println(" ");
            n--;
        }
        sc.close();

    }
}
