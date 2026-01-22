package com.java.fundamentals;

import java.util.Scanner;

public class ProductPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float productPrice, discountPercentage, discountAmount;
        float finalPrice, finalQuantityPrice, totalSavedAmount;
        int quantity;
        float centralTax = 2.5F;
        float stateTax = 2.5F;
        System.out.println("Enter Product Price : ");            //variables declaration
        productPrice = sc.nextFloat();                     //input,assign,calculations,print
        System.out.println("Enter Discount Percentage : ");
        discountPercentage = sc.nextFloat();


        discountAmount = productPrice * discountPercentage / 100;
        finalPrice = productPrice - discountAmount + (centralTax + stateTax);
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Central Tax : " + centralTax);
        System.out.println("State Tax : " + stateTax);
        System.out.println("final Price of 1 product : " + finalPrice);
        System.out.println("Enter Quantity : ");
        quantity = sc.nextInt();
        finalQuantityPrice = quantity * finalPrice;
        System.out.println("Final Bill : " + finalQuantityPrice);
        totalSavedAmount = (productPrice * quantity) - finalQuantityPrice;
        System.out.println("Total amount saved :" + totalSavedAmount);
        sc.close();
    }
}
