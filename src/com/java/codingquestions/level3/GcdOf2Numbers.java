package com.java.codingquestions.level3;

import java.util.Scanner;
//27.GCD/HCF of 2 numbers
public class GcdOf2Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1=sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2=sc.nextInt();
        //Euclid method
        while (num2!=0){
            int remainder=num1%num2;
            num1=num2;
            num2=remainder;
        }
        System.out.println("GCD OF 2 NUMBERS : "+ num1);
        sc.close();
    }
}
