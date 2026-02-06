package com.java.codingquestions.level5;

//10.Find the second largest digit
public class SecondLargestDigit {

    public static void main(String[] args) {

        int number = 938475;
        int largest = -1;
        int secondLargest = -1;

        while (number > 0) {
            int digit = number % 10;

            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit < largest && digit > secondLargest) {
                secondLargest = digit;
            }

            number = number / 10;
        }

        if (secondLargest != -1) {
            System.out.println("Second largest digit is: " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist");
        }
    }
}

