package base;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        //Input
        System.out.print("Enter a noun: ");
        String noun = newScan.nextLine();

        System.out.print("Enter a verb: ");
        String verb = newScan.nextLine();

        System.out.print("Enter an adjective: ");
        String adj = newScan.nextLine();

        System.out.print("Enter an adverb: ");
        String adv = newScan.nextLine();

        //Concat
        String output = "Do you " + verb + " your " + adj + " " + noun + " " + adv + "? That's hilarious!";

        //Output
        System.out.println(output);
    }

}
