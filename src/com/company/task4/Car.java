package com.company.task4;

public class Car {
    private final String brand;
    private String colour;

    public Car(String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getColour() {
        return colour;
    }

    public void changeColour(String colour) {
        if (brand.equals("Audi")) {
            if (colour.equals("blue") || colour.equals("red") || colour.equals("green")) {
                this.colour = colour;
            }
        }
        if (brand.equals("BMW")) {
            if (colour.equals("orange") || colour.equals("black") || colour.equals("purple")) {
                this.colour = colour;
            }
        }
        if (brand.equals("KIA")) {
            if (colour.equals("yellow") || colour.equals("grey") || colour.equals("white")) {
                this.colour = colour;
            }
        }
    }

    public void print() {
        System.out.println(getBrand() + "'s colour is " + getColour());
    }
}
