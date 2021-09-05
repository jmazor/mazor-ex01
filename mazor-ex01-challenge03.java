/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        // prints text
        System.out.print("What is the quote? ");
        String quote;
        Scanner scanIn = new Scanner(System.in);
        // inputs text
        quote = scanIn.nextLine();
        String name;
        System.out.print("Who said it? ");
        // inputs more text
        name = scanIn.nextLine();
        scanIn.close();
        // prints output using special chars
        System.out.println(name + " says, " + "\"" + quote + "\"");
    }
}
