package com.dodo.app.product.dto;

import java.util.Random;

public class Product {

    private int id;
    private String name;
    private double price;
    private Random random = new Random();

    public Product() {
    }

    public Product(String name, double price) {
       this.id = random.nextInt(100);
       this.name = name;
       this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
