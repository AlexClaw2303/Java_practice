package com.company;

public class Ball {
    private String name;
    private int Price;
    public Ball(String n, int price) {
        name = n;
        Price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name) {
        return name;
    }
    public void SetPrice(int price) {
        this.Price = price;
    }
    public String getPrice(String price){
        return price;
    }
}
