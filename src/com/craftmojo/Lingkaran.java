package com.craftmojo;

public class Lingkaran implements Shape {
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public Double hitungLuas() {
        return Math.PI * r * r;
    }
}
