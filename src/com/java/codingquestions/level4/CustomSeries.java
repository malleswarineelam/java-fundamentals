package com.java.codingquestions.level4;
//40.Generate a custom series using loops
//series pattern : n × (n + 1)
import java.util.Scanner;
public class CustomSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i * (i + 1) + " ");
        }
        sc.close();
    }
}

