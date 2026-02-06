package com.java.codingquestions.level5;

//6.Java Program: Binary to Decimal
public class BinaryToDecimal {

    public static void main(String[] args) {

        int binary = 1010;
        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int digit = binary % 10;
            decimal = decimal + digit * (int) Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Decimal number is: " + decimal);
    }
}

