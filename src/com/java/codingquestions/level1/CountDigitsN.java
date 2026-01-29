package com.java.codingquestions.level1;
//9.Count digits of a number
import java.util.Scanner;
public class CountDigitsN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;

        while(n>0){
            count=count+1;
            n=n/10;
        }
        System.out.println(count);
        sc.close();
    }}
