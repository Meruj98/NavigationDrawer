package com.example.meruj.navigationdrawer;

public class Restaurant {
    int id;
    String num;
    String adress;
    String km;


    public Restaurant(int id,  String adress, String km,String num) {
        this.id = id;
        this.num = num;
        this.adress = adress;
        this.km = km;
    }

    public int getId() {
        return id;
    }

    public String getAdress() {
        return adress;
    }

    public String getKm() {
        return km;
    }
}
