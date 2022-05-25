package com.company;

public class Skyline extends Nissan {
    private double volume;

    public Skyline(ColorEnum color, ModelEnum model, int year) {
        super(color, model, year);
    }


//    public double getVolume() {
//        return volume;
//    }

    public void makeVoice() {
        System.out.println("Это Skyline");
    }
}

//    public String getInfo() {
//        return super.getInfo() +
//                "\nYear: " + getYear() +
//                "\nVolume: " + getVolume();
//    }
//    }

