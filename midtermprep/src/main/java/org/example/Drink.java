package org.example;

public class Drink extends MenuItem {

    double volume;
    double price;

    public Drink(String code, String name, double price, double volume){
        this.code = code;
        this.name = name;
        this.price = price;
        this.volume = volume;
    }

    @Override
    public String getDescription(){
        return "volume";
    }

    public void setVolume(double volume){
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }
}
