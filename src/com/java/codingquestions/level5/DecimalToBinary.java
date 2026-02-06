package com.java.codingquestions.level5;

public class DecimalToBinary {
    //️ 5. Convert decimal to binary using loops
    public static void main(String[] args) {

        int decimal = 10;
        int binary = 0;
        int place = 1;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = binary + remainder * place;
            place = place * 10;
            decimal = decimal / 2;
        }

        System.out.println("Binary number is: " + binary);
    }
}

