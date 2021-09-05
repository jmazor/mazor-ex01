/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Justin Mazor
 */

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun;
        // inputs noun
        noun = scanIn.nextLine();
        System.out.print("Enter a verb: ");
        String verb;
        // inputs verb
        verb = scanIn.nextLine();
        System.out.print("Enter a adjective: ");
        String adjective;
        // inputs adjective
        adjective = scanIn.nextLine();
        System.out.print("Enter a adverb: ");
        String adverb;
        // inputs adverb
        adverb = scanIn.nextLine();
        scanIn.close();
        // prints in order
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
