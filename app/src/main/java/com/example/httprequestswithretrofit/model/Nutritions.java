package com.example.httprequestswithretrofit.model;

public class Nutritions {

    private double calories;
    private double fat;
    private double sugar;
    private double carbohydrates;
    private double protein;

    public Nutritions(double calories, double fat, double sugar, double carbohydrates, double protein) {
        this.calories = calories;
        this.fat = fat;
        this.sugar = sugar;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public Nutritions() {
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }
}
