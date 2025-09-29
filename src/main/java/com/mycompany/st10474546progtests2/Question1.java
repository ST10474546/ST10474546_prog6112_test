
package com.mycompany.st10474546progtests2;


public class Question1 {

   
    public static void main(String[] args) {
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};

        // Stadiums
        String[] stadiums = {"Kingsmead", "St Georges", "Wanderers"};

        // Amount of runs scored by each batsman at each stadium
        int[][] runs = {
                {5000, 3500, 6200}, // Jacques Kallis
                {3800, 3700, 5000}, // Hashim Amla
                {4200, 3900, 5200}  // AB de Villiers
        };

        // Display for the total runs scored by each batsman
        System.out.println("Total Runs by Each Batsman");
        for (int i = 0; i < batsmen.length; i++) {
            int total = 0;
            for (int j = 0; j < stadiums.length; j++) {
                total += runs[i][j];
            }
            System.out.println(batsmen[i] + ": " + total + " runs");
        }

        System.out.println("\nHighest Runs per Stadium");
        for (int j = 0; j < stadiums.length; j++) {
            int highest = runs[0][j];
            int bestBatsmanIndex = 0;
            for (int i = 1; i < batsmen.length; i++) {
                if (runs[i][j] > highest) {
                    highest = runs[i][j];
                    bestBatsmanIndex = i;
                }
            }
            System.out.println(stadiums[j] + ": " + batsmen[bestBatsmanIndex] + " with " + highest + " runs");
        }

        //The stadium with the most total runs scored
        int topStadiumIndex = 0;
        int maxStadiumRuns = 0;

        System.out.println("\nTotal Runs per Stadium");
        for (int j = 0; j < stadiums.length; j++) {
            int stadiumTotal = 0;
            for (int i = 0; i < batsmen.length; i++) {
                stadiumTotal += runs[i][j];
            }
            System.out.println(stadiums[j] + ": " + stadiumTotal + " runs");

            if (stadiumTotal > maxStadiumRuns) {
                maxStadiumRuns = stadiumTotal;
                topStadiumIndex = j;
            }
        }

        System.out.println("\nStadium with the most runs overall: " +
                stadiums[topStadiumIndex] + " with " + maxStadiumRuns + " runs");
    }
    }
    

