package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte age;
        System.out.println("enter your age : ");
        age=sc.nextByte();
        System.out.println("Age : "+ age);
        sc.close();

    }
}
