package com.win.TestScore.java;

import java.util.Scanner;

public class Calculations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number : ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int addedNums = num1 + num2;
        System.out.println(num1 + " + " + num2 +" = " + addedNums);

        int subNums = num1 - num2;
        System.out.println(num1 + " - " + num2 +" = " + subNums);

        int multiplynum = num1 * num2;
        System.out.println(num1 + " * " + num2 +" = " + multiplynum);

        double divNums = (float)num1/num2;
        System.out.println(num1 + " / " + num2 +" = " + divNums);

        int modulsNums = num1 % num2;
        System.out.println(num1 + " % " + num2 +" = " + modulsNums);

        scanner.close();
    }
}