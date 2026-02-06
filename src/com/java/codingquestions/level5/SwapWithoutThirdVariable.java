package com.java.codingquestions.level5;
//1.🔁 Swap Two Numbers Without Using Third Variable (Java)
import java.util.Scanner;

public class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2 :");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

