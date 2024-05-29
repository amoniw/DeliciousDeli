package com.pluralsight.toppings;

public abstract class PremiumTopping extends Topping {
    public PremiumTopping(String name) {
        super(name);
    }

    public abstract double getPrice(int sandwichSize);
}
