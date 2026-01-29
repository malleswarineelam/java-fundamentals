package com.java.codingquestions.level1;
import java.util.Scanner;
//6.sum of first N natural Numbers
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

