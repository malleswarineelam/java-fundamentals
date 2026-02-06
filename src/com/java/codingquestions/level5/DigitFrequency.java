package com.java.codingquestions.level5;

//8.Find frequency of each digit
public class DigitFrequency {

    public static void main(String[] args) {

        int number = 12034551;
        int[] freq = new int[10];   // digits 0–9

        while (number > 0) {
            int digit = number % 10;
            freq[digit]++;
            number = number / 10;
        }

        System.out.println("Digit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " → " + freq[i]);
            }
        }
    }
}

