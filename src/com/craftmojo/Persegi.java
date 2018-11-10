package com.craftmojo;

public class Persegi implements Shape{
    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    private double sisi;

    @Override
    public Double hitungLuas() {
        return sisi * sisi;
    }


}
