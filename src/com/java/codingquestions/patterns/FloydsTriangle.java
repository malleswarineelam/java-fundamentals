package com.java.codingquestions.patterns;

import java.util.Scanner;

public class FloydsTriangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1, r = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
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
