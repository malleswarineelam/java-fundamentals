package com.java.codingquestions.level5;

//9.Find the first repeating digit
public class FirstRepeatingDigit {

    public static void main(String[] args) {

        int number = 1234251;
        int[] freq = new int[10];
        int firstRepeating = -1;

        // Convert number to string to scan left → right
        String num = String.valueOf(number);

        for (int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';

            freq[digit]++;

            if (freq[digit] == 2) {
                firstRepeating = digit;
                break;
            }
        }

        if (firstRepeating != -1) {
            System.out.println("First repeating digit is: " + firstRepeating);
        } else {
            System.out.println("No repeating digit found");
        }
    }
}

