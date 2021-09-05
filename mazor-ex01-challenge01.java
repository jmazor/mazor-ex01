/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        // Prints text
        System.out.print("What is your name? ");
        String name;
        // creates scanner
        Scanner scanIn = new Scanner(System.in);
        // takes input
        name = scanIn.nextLine();
        scanIn.close();
        // prints input
        System.out.println("Hello, " + name +  " nice to meet you!");
    }
}
