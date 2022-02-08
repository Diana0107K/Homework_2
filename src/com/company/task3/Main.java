package com.company.task3;

public class Main {
    public static void main(String[] args) {
        Accumulation figure = new Accumulation();
        figure.accumulate(1);
        figure.accumulate(2);
        figure.accumulate(3);
        figure.accumulate(4);
        figure.accumulate(5);
        figure.accumulate(6);
        figure.accumulate(30);
        figure.accumulate(30);
        figure.printAverage();
    }
}

