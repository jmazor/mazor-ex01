/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        // asks for first number
        System.out.print("What is the first number? ");
        int num1;
        Scanner scanIn = new Scanner(System.in);
        // gets first number
        num1 = scanIn.nextInt();
        int num2;
        // asks for second number
        System.out.print("What is the second number? ");
        // gets second number
        num2 = scanIn.nextInt();
        scanIn.close();
        // prints math
        // +
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        // -
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        // *
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        // /
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
    }
}
