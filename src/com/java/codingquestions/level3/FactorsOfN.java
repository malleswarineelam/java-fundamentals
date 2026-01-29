package com.java.codingquestions.level3;

import java.util.Scanner;
//22.factors of given number
public class FactorsOfN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        System.out.println("factors of given number are : ");
        for (int i=1;i<=N;i++){
            if (N%i==0){
                System.out.println(i);
            }

        }
        sc.close();

    }
}
