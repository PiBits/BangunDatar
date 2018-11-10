package com.craftmojo;

public class Main{

    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();
        L1.setR(7);
        System.out.println("Luas Lingkaran: "+
                L1.hitungLuas());

        Persegi P1 = new Persegi();
        P1.setSisi(7);
        System.out.println("Luas Persegi: "+
                P1.hitungLuas());

        Segitiga S1 = new Segitiga();
        S1.setAlas(7);
        S1.setTinggi(7);
        System.out.println("Luas Segitiga: "+
                S1.hitungLuas());
    }
}
