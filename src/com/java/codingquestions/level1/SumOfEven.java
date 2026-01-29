package com.java.codingquestions.level1;

import java.util.Scanner;

//7.sum of even numbers between 1 to N
public class SumOfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int N = sc.nextInt();
        int evenSum = 0;
        int i = 1;
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.println(i);
                evenSum = evenSum + i;
            }
            i = i + 1;
        }
        System.out.println("Their sum : ");
        System.out.println(evenSum);
        sc.close();
    }

}
