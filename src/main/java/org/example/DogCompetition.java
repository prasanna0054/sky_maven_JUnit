package org.example;

import java.util.Scanner;

public class DogCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the placement of your dog (1-100): ");
        int winningPlacement = scanner.nextInt();

        String result = getPlacementString(winningPlacement);
        if (result.equals("Enter 1-100 Only")) {
            System.out.println(result);
        } else {
            System.out.println("Formatted list from 1-100 (excluding " + winningPlacement + "):");
            for (int i = 1; i <= 100; i++) {
                if (i == winningPlacement) {
                    continue;
                }
                System.out.print(getPlacementString(i) + ", ");

            }
        }

        scanner.close();
    }

    public static String getPlacementString(int placement) {
        if (placement < 1 || placement > 100) {
            return "Enter 1-100 Only";
        } else if (placement % 10 == 1 && placement % 100 != 11) {
            return placement + "st";
        } else if (placement % 10 == 2 && placement % 100 != 12) {
            return placement + "nd";
        } else if (placement % 10 == 3 && placement % 100 != 13) {
            return placement + "rd";
        } else {
            return placement + "th";
        }
    }
}