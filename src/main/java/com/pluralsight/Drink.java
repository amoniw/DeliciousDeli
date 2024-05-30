package com.pluralsight;

import java.util.Scanner;

public class Drink {

    private int size;
    private String flavor;

    public Drink(int size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

public double calculatePrice() {
        Scanner scanner = new Scanner(System.in);
        String drinksize = scanner.nextLine();

        // switch case to get the price of the drink based on size
        switch (drinksize.toLowerCase()) {
            case "small":
                double price = 2.00;
                break;

            case "medium":
                price = 2.50;
                break;

            case "large"
                price = 3.00;
                break;
        }
    }
}



