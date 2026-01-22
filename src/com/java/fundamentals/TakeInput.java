package com.java.fundamentals;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // bye datatype

        byte age, fingers, teeth ,phValue ,waistSize;

        System.out.println("enter your age : ");
        age=sc.nextByte();

        System.out.println("enter your number of fingers : ");
        fingers = sc.nextByte();

        System.out.println("enter your number of teeth : ");
        teeth = sc.nextByte();

        System.out.println("enter your body phValue : ");
        phValue = sc.nextByte();

        System.out.println("enter your waistSize : ");
        waistSize = sc.nextByte();

        System.out.println("Age : " + age);
        System.out.println("Fingers : " + fingers);
        System.out.println("Teeth : " + teeth);
        System.out.println("PhValue : " + phValue);
        System.out.println("WaistSize : " + waistSize);

        // short 5 variables

        short height, weight, marks, armLength, pocketMoney;

        System.out.println("Enter your height (in cm): ");
        height = sc.nextShort();

        System.out.println("Enter your weight (in kg): ");
        weight = sc.nextShort();

        System.out.println("Enter your total marks: ");
        marks = sc.nextShort();

        System.out.println("Enter your arm length (in cm): ");
        armLength = sc.nextShort();

        System.out.println("Enter your pocket money: ");
        pocketMoney = sc.nextShort();

        System.out.println("Height : " + height);
        System.out.println("Weight : " + weight);
        System.out.println("Marks : " + marks);
        System.out.println("Arm Length : " + armLength);
        System.out.println("Pocket Money : " + pocketMoney);

        // int 5 variables

        int length, salary, iphonePrice, laptopCost, depth;

        System.out.println("Enter the length value: ");
        length = sc.nextInt();

        System.out.println("Enter your monthly salary: ");
        salary = sc.nextInt();

        System.out.println("Enter iPhone price: ");
        iphonePrice = sc.nextInt();

        System.out.println("Enter laptop cost: ");
        laptopCost = sc.nextInt();

        System.out.println("Enter the depth value: ");
        depth = sc.nextInt();

        System.out.println("Length : " + length);
        System.out.println("Salary : " + salary);
        System.out.println("iPhone Price : " + iphonePrice);
        System.out.println("Laptop Cost : " + laptopCost);
        System.out.println("Depth : " + depth);

        // long 5 variables

        long volume, worldPopulation, aadhaarNumber, accountNumber, hallTicketNumber;

        System.out.println("Enter volume: ");
        volume = sc.nextLong();

        System.out.println("Enter world population: ");
        worldPopulation = sc.nextLong();

        System.out.println("Enter Aadhaar number: ");
        aadhaarNumber = sc.nextLong();

        System.out.println("Enter account number: ");
        accountNumber = sc.nextLong();

        System.out.println("Enter hall ticket number: ");
        hallTicketNumber = sc.nextLong();

        System.out.println("Volume : " + volume);
        System.out.println("World Population : " + worldPopulation);
        System.out.println("Aadhaar Number : " + aadhaarNumber);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Hall Ticket Number : " + hallTicketNumber);

        // float 5 variables

        float rating, percentage, temperature, screenSize, accountBalance;

        System.out.println("Enter rating: ");
        rating = sc.nextFloat();

        System.out.println("Enter percentage: ");
        percentage = sc.nextFloat();

        System.out.println("Enter temperature: ");
        temperature = sc.nextFloat();

        System.out.println("Enter screen size: ");
        screenSize = sc.nextFloat();

        System.out.println("Enter account balance: ");
        accountBalance = sc.nextFloat();

        System.out.println("Rating : " + rating);
        System.out.println("Percentage : " + percentage);
        System.out.println("Temperature : " + temperature);
        System.out.println("Screen Size : " + screenSize);
        System.out.println("Account Balance : " + accountBalance);

        // double 5 variables

        double bankBalance, distanceToMoon, piValue, latitude, electricityBill;

        System.out.println("Enter bank balance: ");
        bankBalance = sc.nextDouble();

        System.out.println("Enter distance to moon: ");
        distanceToMoon = sc.nextDouble();

        System.out.println("Enter PI value: ");
        piValue = sc.nextDouble();

        System.out.println("Enter latitude: ");
        latitude = sc.nextDouble();

        System.out.println("Enter electricity bill: ");
        electricityBill = sc.nextDouble();

        System.out.println("Bank Balance : " + bankBalance);
        System.out.println("Distance To Moon : " + distanceToMoon);
        System.out.println("PI Value : " + piValue);
        System.out.println("Latitude : " + latitude);
        System.out.println("Electricity Bill : " + electricityBill);

        // char 5 variables

        char grade, gender, section, bloodGroup, shirtSize;

        System.out.println("Enter grade: ");
        grade = sc.next().charAt(0);

        System.out.println("Enter gender: ");
        gender = sc.next().charAt(0);

        System.out.println("Enter section: ");
        section = sc.next().charAt(0);

        System.out.println("Enter blood group: ");
        bloodGroup = sc.next().charAt(0);

        System.out.println("Enter shirt size: ");
        shirtSize = sc.next().charAt(0);

        System.out.println("Grade : " + grade);
        System.out.println("Gender : " + gender);
        System.out.println("Section : " + section);
        System.out.println("Blood Group : " + bloodGroup);
        System.out.println("Shirt Size : " + shirtSize);

        // boolean 5 variables

        boolean isLoggedIn, isPaymentDone, isJavaEasy, isRaining, isMobileCharged;

        System.out.println("Is logged in (true/false): ");
        isLoggedIn = sc.nextBoolean();

        System.out.println("Is payment done (true/false): ");
        isPaymentDone = sc.nextBoolean();

        System.out.println("Is Java easy (true/false): ");
        isJavaEasy = sc.nextBoolean();

        System.out.println("Is it raining (true/false): ");
        isRaining = sc.nextBoolean();

        System.out.println("Is mobile charged (true/false): ");
        isMobileCharged = sc.nextBoolean();

        System.out.println("Is Logged In : " + isLoggedIn);
        System.out.println("Is Payment Done : " + isPaymentDone);
        System.out.println("Is Java Easy : " + isJavaEasy);
        System.out.println("Is Raining : " + isRaining);
        System.out.println("Is Mobile Charged : " + isMobileCharged);22



        sc.close();

    }
}
