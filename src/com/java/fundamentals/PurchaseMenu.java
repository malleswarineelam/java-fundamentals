package com.java.fundamentals;

import java.util.Scanner;

public class PurchaseMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stockAvailable = 100;
        int choice;
        char continueShopping;
        float productPrice, discountPercentage, discountAmount;
        float finalPrice, finalQuantityPrice, totalSavedAmount;
        int quantity, shippingCharges;
        float centralTax = 2.5F;
        float stateTax = 2.5F;
        char memberShip;
        do {
            System.out.println("Welcome To Neelam E-Commerce App");
            System.out.println("1. Products");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.println(" Available Socks Quantity: " + stockAvailable);

                    if (stockAvailable <= 0) {
                        System.out.println("Sorry! Product is out of stock.");
                        break;
                    }
                    System.out.println("Enter Product Price : ");            //variables declaration
                    productPrice = sc.nextFloat();
                    System.out.println("Enter Membership : ");
                    memberShip = Character.toUpperCase(sc.next().charAt(0));
                    switch (memberShip) {
                        case 'S':
                            discountPercentage = 10;
                            shippingCharges = 50;
                            break;
                        case 'G':
                            discountPercentage = 15;
                            shippingCharges = 20;
                            break;
                        case 'D':
                            discountPercentage = 20;
                            shippingCharges = 0;
                            break;
                        default:
                            System.out.println("No Membership");
                            discountPercentage = 0;
                            shippingCharges = 100;
                            break;
                    }
                    discountAmount = productPrice * discountPercentage / 100;
                    finalPrice = productPrice - discountAmount + (centralTax + stateTax) + shippingCharges;
                    System.out.println("Discount Amount : " + discountAmount);
                    System.out.println("Central Tax : " + centralTax);
                    System.out.println("State Tax : " + stateTax);
                    System.out.println("MemberShip of Customer is :  " + memberShip);
                    System.out.println("Shipping charges : " + shippingCharges);
                    System.out.println("final Price of 1 product : " + finalPrice);
                    System.out.println("Enter Quantity : ");
                    quantity = sc.nextInt();
                    if (quantity > stockAvailable) {
                        System.out.println(
                                "Sorry for the inconvenience, You can only buy " + stockAvailable + " quantity right now.");
                        break;
                    }
                    stockAvailable = stockAvailable - quantity;

                    finalQuantityPrice = quantity * finalPrice;
                    System.out.println("Final Bill : " + finalQuantityPrice);
                    totalSavedAmount = (productPrice * quantity) - finalQuantityPrice;
                    System.out.println("Total amount saved :" + totalSavedAmount);

                    break;
                case 2:
                    System.out.println("Thank you for visiting Neelam E-Commerce App");

                    return;

                default:
                    System.out.println("Invalid choice!");
            }
            System.out.print("Do you want to continue shopping? (y/n): ");
            continueShopping = sc.next().toLowerCase().charAt(0);

        } while (continueShopping == 'y');{

        System.out.println("Thank you for shopping with Neelam E-Commerce App, Visit us Again! ");
        sc.close();
            }





                }
}
