package com.java.codingquestions.patterns;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1, r = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(" " + r + " ");
                r++;
                j++;
            }
            System.out.println(" ");
            i++;
        }
        sc.close();
    }

}
