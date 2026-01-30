package com.java.codingquestions.patterns;

import java.util.Scanner;

public class PerfectFloydsTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int r = 1;
        int i = 1;
        while (i <= n) {
            int space = 1;
            while (space <= n - i) {
                System.out.print("  ");
                space++;
            }
            int j = 1;
            while (j <= i) {
                System.out.print(r + "   ");
                r++;
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}

