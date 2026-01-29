package com.java.codingquestions.level2;
import java.util.Scanner;
//15.check whether number is Armstrong or not
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int N = sc.nextInt();
        int count = 0;
        int sum = 0;
        int digit;
        int temp = N;

        while (temp > 0) {
            digit = temp % 10;
            count = count + 1;
            temp=temp/10;
        }
        temp = N;
        while (temp > 0) {
            digit = temp % 10;
            sum +=(int) Math.pow(digit, count);
            temp = temp / 10;
        }
        if (sum == N)
            System.out.println("ArmStrong Number");
        else
            System.out.println("Not a ArmStrong Number");

        sc.close();
    }
}
