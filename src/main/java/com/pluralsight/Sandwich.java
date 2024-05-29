package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String breadOptions;
    private String sandwichSize;
    private List<Topping>;
    private Boolean isToasted;

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

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        toppings = toppings;
    }

    public Boolean getToasted() {
        return isToasted;
    }

    public void setToasted(Boolean toasted) {
        isToasted = toasted;
    }
}