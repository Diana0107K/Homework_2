package com.company.task4;

public class Main {
    public static void main(String[] args) {
        Car one = new Car("Audi", "green");
        one.print();
        one.changeColour("red");
        one.print();

        Car two = new Car("BMW", "black");
        two.print();
        two.changeColour("red");
        two.print();

        Car three = new Car("KIA", "white");
        three.print();
        three.changeColour("grey");
        three.print();
    }
}
