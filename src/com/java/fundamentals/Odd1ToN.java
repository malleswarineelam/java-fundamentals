package com.java.fundamentals;

import java.util.Scanner;

public class Odd1ToN {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int N=sc.nextInt();
        int i = 1;
        while (i<=N){
            if (i%2!=0){
                System.out.println(i);

            }
            i=i+1;
        }
        sc.close();
}}
