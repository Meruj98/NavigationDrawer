package com.example.meruj.navigationdrawer;

public class Drinks {
    int id;
    String name;
    String price;

    public Drinks(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}
