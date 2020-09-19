package com.company;

public class Book {
    private String name;
    private int Price;
    public Book(String n, int price) {
        name = n;
        Price = price;
    }
    public void setTitle(String name) {
        this.name = name;
    }
    public String getTitle(String name) {
        return name;
    }
    public void SetPrice(int price) {
        this.Price = price;
    }
    public String getPrice(String price){
        return price;
    }
}
