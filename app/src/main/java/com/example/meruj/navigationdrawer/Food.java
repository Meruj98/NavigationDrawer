package com.example.meruj.navigationdrawer;

import android.graphics.drawable.Drawable;

public class Food {
    String name;

    int id;

    public Food(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
