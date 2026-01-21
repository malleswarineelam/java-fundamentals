package com.java.fundamentals;
import java.util.Scanner;
public class SumFirstN {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            int sum = 0;
            int i=1;
            while(i<=n) {
                sum+=i;
                i++;
            }
            System.out.println(sum);
        }
    }

