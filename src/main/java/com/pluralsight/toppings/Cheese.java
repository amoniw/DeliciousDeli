package com.pluralsight.toppings;

public class Cheese extends PremiumTopping {
    public Cheese(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        // here you should have a switch case to get the price of the cheese based on the sandwich size
    }
}
