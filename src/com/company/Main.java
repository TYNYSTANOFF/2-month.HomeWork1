package com.company;

public class Main {

    public static void main(String[] args) {
Nissan object = new Nissan(ColorEnum.BLUE, ModelEnum.CEDRIC, 2000);
Skyline object2 = new Skyline(ColorEnum.RED, ModelEnum.SKYLINE, 1999);
Skyline object3 = new Skyline(ColorEnum.BLUE, ModelEnum.SKYLINE, 1998);

       object.makeVoice();
        object2.makeVoice();
        object3.makeVoice();


    }
}
