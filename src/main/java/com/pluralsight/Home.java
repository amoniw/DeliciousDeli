package com.pluralsight;
import java.util.Scanner;

public class Home {

    private static Order currentOrder;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to Delicious Deli");
            System.out.println("Please select option.");
            System.out.println("1. New Order");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine().trim();
        }
    }
}


