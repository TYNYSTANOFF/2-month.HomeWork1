package com.company;

public class CarChair {
    private MaterialEnum material;
    private ColorEnum color;

    public MaterialEnum getMaterial() {
        return material;
    }

    public ColorEnum getColor() {
        return color;
    }

    public CarChair(MaterialEnum material, ColorEnum color) {
        this.material = material;
        this.color = color;
    }
}
