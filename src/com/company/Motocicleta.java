package com.company;

import java.io.Serializable;

public class Motocicleta extends Vehiculo implements Serializable {

    private double cilindrada;

    public Motocicleta (){
        super();
    }

    public Motocicleta(String modelo, double precio, String tipo, double cilindrada) {
        super(modelo, precio, tipo);
        this.cilindrada = cilindrada;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Motocicleta: " +
                "Cilindrada: " + this.cilindrada + "\n";
    }
}
