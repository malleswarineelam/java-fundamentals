package com.java.codingquestions.level5;

public class MissingNumber {
    //3️⃣ Find missing number in a sequence
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 5};
        int N = 5;   // Total numbers from 1 to N

        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int element : array) {
            actualSum = actualSum + element;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number is: " + missingNumber);
    }
}
