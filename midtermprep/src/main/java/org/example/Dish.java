package org.example;

public class Dish extends MenuItem{

    CuisineType cuisineType;
    private String mainIngredient;

    public Dish(String code, String name,
                double price, CuisineType cuisineType, String mainIngredient){
        this.code = code;
        this.name = name;
        this.price = price;
        this.cuisineType = cuisineType;
        this.mainIngredient = mainIngredient;
    }

    @Override
    public String getDescription(){
        return cuisineType + " " + mainIngredient;
    }

    public CuisineType getCuisineType(){
        return cuisineType;
    }
    public void setCuisineType(CuisineType cuisineType){
        this.cuisineType = cuisineType;
    }
    public String getMainIngredient(){
        return mainIngredient;
    }
    public void setMainIngredient(String mainIngredient){
        this.mainIngredient = mainIngredient;
    }

}
