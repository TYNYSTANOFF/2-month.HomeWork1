package com.company;

public class Car {
    private ColorEnum color;


    public ColorEnum getColor() {
        return color;
    }


    public Car(ColorEnum color) {
        this.color = color;
    }

    public String getInfo() {
        return  "Color: " + getColor();
    }
}
