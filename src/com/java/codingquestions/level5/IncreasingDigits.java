package com.java.codingquestions.level5;

//7. Check whether digits are in increasing order
public class IncreasingDigits {

    public static void main(String[] args) {

        int number = 123459;
        int previousDigit = 10;   // greater than any digit (0–9)
        boolean isIncreasing = true;

        while (number > 0) {
            int currentDigit = number % 10;

            if (currentDigit >= previousDigit) {
                isIncreasing = false;
                break;
            }

            previousDigit = currentDigit;
            number = number / 10;
        }

        if (isIncreasing) {
            System.out.println("Digits are in increasing order");
        } else {
            System.out.println("Digits are NOT in increasing order");
        }
    }
}
