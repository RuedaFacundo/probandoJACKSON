package com.company;

import java.io.Serializable;

public abstract class Vehiculo implements Serializable {

    private String modelo;
    private double precio;
    private String tipo;

    public Vehiculo(){}

    public Vehiculo(String modelo, double precio, String tipo) {
        this.modelo = modelo;
        this.precio = precio;
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Vehiculo " + "\n" +
                "Modelo: " + this.modelo +
                ", Precio: $" + this.precio +
                ", Tipo: " + this.tipo + "\n";
    }
}

