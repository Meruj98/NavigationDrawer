package com.example.meruj.navigationdrawer;

public class Sobitiya {
    private int id;
    private String header;
    private String text;

    public Sobitiya(int id, String header, String text) {
        this.id = id;
        this.header = header;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getHeader() {
        return header;
    }
}
