package com.java.fundamentals;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1 : ");

        byte num1=sc.nextByte();
        System.out.println("enter num2 : ");
        byte num2=sc.nextByte();
        short res;
        res = (short)(num1+num2);
        System.out.println("result = " + res);
        sc.close();
    }
}
// pro 100 quantites
// product price, discount price ===final price ki 2.5 % 2.5 % state taxthen total price
//each prodcut price entha entha save chesam,100 quantites price and how much saved on them