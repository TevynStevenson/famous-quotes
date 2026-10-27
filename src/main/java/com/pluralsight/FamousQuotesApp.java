package com.pluralsight;

//Import Scanner and ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class FamousQuotesApp {
    public static void main(String[] args) {

        //Get new scanner
        Scanner quotePrompt = new Scanner(System.in);

        //Add try statemen

        //Set up Array List
        ArrayList<String> quotes = setUpArrayList();

        //Add try/catch statement
        try {
            System.out.println("Pick a quote 1-10");
            int selection = quotePrompt.nextInt();

            System.out.println(quotes.get(selection - 1));
        } catch (Exception e) {
            System.out.println("Invalid selection. Please enter a number from 1-10");
        }

        //Prompt user to ask for prompt 1-10
        System.out.println("Pick a quote 1-10");
        int selection = quotePrompt.nextInt();

        System.out.println(quotes.get(selection));







    }

    private static ArrayList<String> setUpArrayList() {
        ArrayList<String> quotes = new ArrayList<>();
        quotes.add("No one ever drowned in sweat");
        quotes.add("Winners never quit and quitters never win");
        quotes.add("Effort will never be questioned");
        quotes.add("Stay hungry, remain humble, and get beter today");
        quotes.add("It's not whether you get knocked down, it's whether you get back up");
        quotes.add("A champion is simply someone who did not give up when they wanted to");
        quotes.add("I don't believe in perfection. I believe in relentless improvement");
        quotes.add("Play with your heart");
        quotes.add("Attitude is everything");
        quotes.add("Refuse to lose");
        return quotes;
    }
}

