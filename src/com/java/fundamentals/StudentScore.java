package com.java.fundamentals;

import java.util.Scanner;

public class StudentScore {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subjects Marks");
        System.out.println("Enter Subject1 Marks : ");
        byte subject1Marks = sc.nextByte();
        System.out.println("Enter Subject2 Marks : ");
        byte subject2Marks = sc.nextByte();
        System.out.println("Enter Subject3 Marks : ");
        byte subject3Marks = sc.nextByte();
        System.out.println("Enter Subject4 Marks : ");
        byte subject4Marks = sc.nextByte();
        System.out.println("Enter Subject5 Marks : ");
        byte subject5Marks = sc.nextByte();
        System.out.println("Enter Subject6 Marks : ");
        byte subject6Marks = sc.nextByte();
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks + subject6Marks;
        System.out.println("Total Marks : " + totalMarks);
        float averageScore = (float) (totalMarks) / 6;
        System.out.println("Average Score :" + averageScore);
        sc.close();


    }
}
