package com.pluralsight;

import java.util.Scanner;

public class Home {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Welcome to Delicious Deli
            System.out.println("Home Screen");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            // prompt user for their choice
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            // process the users choice
            switch (choice) {
                case 1:
                    System.out.println("New Order.");
                    // add new order
                    break;
                case 0:
                    System.out.println("Exit the Application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        } while (choice != 0);

        // close scanner
        scanner.close();
    }
}
