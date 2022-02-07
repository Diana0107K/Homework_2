package com.company.task2;

public class Box {
    private final int length;
    private final int width;
    private final int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length, int width) {
        this.length = length;
        this.width = width;
        this.height = 0;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void determineTheTypeOfBox() {
        if (height == 0) {
            System.out.println("Конверт");
        } else if (length == width && length == height) {
            System.out.println("Куб");
        } else {
            System.out.println("Обычная коробка");
        }
    }
}
