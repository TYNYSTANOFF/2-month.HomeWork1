package com.company;

public class Nissan extends Car{
    private ModelEnum model;
    private int year;

    public ModelEnum getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Nissan(ColorEnum color, ModelEnum model, int year) {
        super(color);
        this.model = model;
        this.year = year;
    }



    public void makeVoice(){
        System.out.println("Это Ниссан");
    }

    public final void makeVoice (String voice) {
        System.out.println(voice);
    }

    public String getInfo() {
        return super.getInfo() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear();
    }
}
