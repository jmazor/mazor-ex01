/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        // prints text
        System.out.print("What is the input string? ");
        String name;
        // creates scanner
        Scanner scanIn = new Scanner(System.in);
        // inputs texts
        name = scanIn.nextLine();
        scanIn.close();
        // determines length and prints text
        System.out.println(name + " has " + name.length() + " characters.");
    }
}
