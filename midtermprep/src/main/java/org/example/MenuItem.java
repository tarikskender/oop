package org.example;

public abstract class MenuItem implements Billable{

    public String code;
    public String name;
    double price;

    public double applyDiscount(double discountRate){
        return price = price/discountRate;
    }
    public String getDescription(){
        return code+name;
    }
    public String getCode(){
        return code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;

    } public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

}
