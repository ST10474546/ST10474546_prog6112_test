
package com.mycompany.st10474546progtests2.Question2;

import java.util.*;
public class CricketApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter batsman name: ");
        String batsman = sc.nextLine();

        System.out.print("Enter stadium name: ");
        String stadium = sc.nextLine();

        System.out.print("Enter total runs scored: ");
        int runs = sc.nextInt();

        // Create object
        CricketRunsScored player = new CricketRunsScored(batsman, stadium, runs);

        // Display output
        System.out.println("The cricketer name: " + player.getBatsman());
        System.out.println("Enter the stadium: " + player.getStadium());
        System.out.println("Enter the total runs scored by " + player.getBatsman() + " at " + player.getStadium() + 
                ": " + player.getRunsScored());

        sc.close();
    }
    }
    

