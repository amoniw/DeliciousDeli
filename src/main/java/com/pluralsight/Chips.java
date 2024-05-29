package com.pluralsight;

public class Chips {

    private String name;
    private String type;
    private Double price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return type +"Chips";
    }

    public Chips(String name, String type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;







    }
}
