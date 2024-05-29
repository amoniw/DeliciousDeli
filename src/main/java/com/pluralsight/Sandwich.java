package com.pluralsight;

import com.pluralsight.toppings.Topping;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadOptions;
    private String sandwichSize;
    private List<Topping> toppings;
    private Boolean isToasted;

    public Sandwich(String breadOptions, String sandwichSize) {
        this.breadOptions = breadOptions;
        this.sandwichSize = sandwichSize;
        this.toppings = new ArrayList<>();
        this.isToasted = false;
    }

    // add getters and setters

    // add a method add Topping to add it in the list toppings

    // calculate Price based on the toppings that you have

    // method to print the information of the sandwich

}