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

    public String getBreadOptions() {
        return breadOptions;
    }

    public void setBreadOptions(String breadOptions) {
        this.breadOptions = breadOptions;
    }

    public String getSandwichSize() {
        return sandwichSize;
    }

    public void setSandwichSize(String sandwichSize) {
        this.sandwichSize = sandwichSize;
    }

    public Boolean getToasted() {
        return isToasted;
    }

    public void setToasted(Boolean toasted) {
        isToasted = toasted;
    }

     public void Toppings(Topping topping) {
        toppings.add(topping);
        // add a method add Topping to add it in the list toppings
    }

    public void calculatePrice() {
        double price = 0;
        for (Topping topping : toppings) {
            price += topping.getPrice();
        }
        price;
    }

    // calculate Price based on the toppings that you have

    // method to print the information of the sandwich

}