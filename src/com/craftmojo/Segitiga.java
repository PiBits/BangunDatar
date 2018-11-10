package com.craftmojo;

public class Segitiga implements Shape{
    private double alas;
    private double tinggi;

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public Double hitungLuas() {
        return alas * tinggi /2;
    }
}
