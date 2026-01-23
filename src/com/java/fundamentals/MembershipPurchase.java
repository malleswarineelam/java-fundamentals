package com.java.fundamentals;

import java.util.Scanner;

public class MembershipPurchase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float productPrice, discountPercentage, discountAmount;
        float finalPrice, finalQuantityPrice, totalSavedAmount;
        int quantity, shippingCharges;

        float centralTax = 2.5F;
        float stateTax = 2.5F;
        char memberShip;

        System.out.println("Enter Product Price : ");            //variables declaration
        productPrice = sc.nextFloat();
        System.out.println("Enter Membership : ");
        memberShip = Character.toUpperCase(sc.next().charAt(0));
        if (memberShip == 'S') {
            discountPercentage = 10;
            shippingCharges = 50;
        } else if (memberShip == 'G') {
            discountPercentage = 15;
            shippingCharges = 20;
        } else if (memberShip == 'D') {
            discountPercentage = 20;
            shippingCharges = 0;
        } else {
            discountPercentage = 0;
            shippingCharges = 100;
        }
        discountAmount = productPrice * discountPercentage / 100;
        finalPrice = productPrice - discountAmount + (centralTax + stateTax)+shippingCharges;
        System.out.println("Discount Amount : " + discountAmount);
        System.out.println("Central Tax : " + centralTax);
        System.out.println("State Tax : " + stateTax);
        System.out.println("MemberShip of Customer is :  " + memberShip);
        System.out.println("Shipping charges : " + shippingCharges);
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
