package com.example.encapsulationtestingjava;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid Product Price");
        }
    }

    public void get() {
        if (price >= 0) {
            System.out.println("Product Name: " + name + ", Product Price: " + price);
        } else {
            throw new IllegalArgumentException("Invalid Product Price");
        }
    }

    public void set(String pdtName, double pdtPrice) {
        this.name = pdtName;
        if (pdtPrice >= 0) {
            this.price = pdtPrice;
            System.out.println("Product Name: " + name + ", Product Price: " + price);
        } else {
            throw new IllegalArgumentException("Invalid Product Price");
        }
    }

    // Getter methods for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}