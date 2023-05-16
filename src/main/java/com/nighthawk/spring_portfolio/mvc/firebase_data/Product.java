package com.nighthawk.spring_portfolio.mvc.firebase_data;

public class Product {

    private String name;

    private String description;

    private double price;

    private boolean inStock;


    public Product(String name, String description, double price,boolean inStock) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setAge(double price) {
        this.price = price;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
