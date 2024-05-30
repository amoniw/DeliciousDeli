package com.pluralsight;

import java.util.Scanner;

public class Drink {

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

public double calculatePrice() {
double price  =0;
        // switch case to get the price of the drink based on size
        switch (size.toLowerCase()) {
            case "small":
                 price = 2.00;
                break;

            case "medium":
                price = 2.50;
                break;

            case "large":
                price = 3.00;
                break;
        }
        return price;
    }
}



