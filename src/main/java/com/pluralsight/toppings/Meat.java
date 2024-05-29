package com.pluralsight.toppings;

public class Meat extends PremiumTopping {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        // here you should have a switch case to get the price of the meat based on the sandwich size
    }


}
