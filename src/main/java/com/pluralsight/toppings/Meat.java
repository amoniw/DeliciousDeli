package com.pluralsight.toppings;

public class Meat extends PremiumTopping {
    public Meat(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        double price;
        switch (sandwichSize) {
            case 4:
                price = 1.00;
                break;

            case 8:
                price = 2.00;
                break;

            case 12:
                price = 3.00;
                break;
        }

    }

}
// here you should have a switch case to get the price of the meat based on the sandwich size



