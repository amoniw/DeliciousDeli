package com.pluralsight.toppings;

import java.util.Scanner;

public class Cheese extends PremiumTopping {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        double cheesePrice = 0.0;

        // here you should have a switch case to get the price of the cheese based on the sandwich size

        switch (sandwichSize) {
            case 4:
                cheesePrice = .75;
                break;
            case 8:
                cheesePrice = 1.50;
                break;
            case 12:
              cheesePrice =  2.25;
              break;
        }
        return cheesePrice;
    }
}