package com.coche;

public class Coche {
    //1. Atributos
    String fabricante;
    protected String modelo;
    protected double cc;
    protected int year;
    protected boolean sport;
    protected int speed;
    protected String motor;

    //2. Constructores
    public Coche(){}

    public Coche(String fabricante, String modelo, double cc, int year, boolean sport, int speed, String motor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.cc = cc;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public Coche(String fabricante, int year) {
        this.fabricante = fabricante;
        this.year = year;
    }

    //3. Métodos (comportamientos)
    public void acelerar(int quantity){
        if(quantity >= 0 && quantity <= 120)
            this.speed += quantity;
    }
}
