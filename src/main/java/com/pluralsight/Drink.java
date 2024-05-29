package com.pluralsight;

public class Drink {
   private String name;
   private String type;
   private Double price;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Drink(Double price, String name, String type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }
