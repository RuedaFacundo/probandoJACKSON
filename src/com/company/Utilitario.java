package com.company;

import java.io.Serializable;

public class Utilitario extends Vehiculo implements Serializable {

    private double kg;
    private double altura;

    public Utilitario(){
        super();
    }

    public Utilitario(String modelo, double precio, String tipo, double kg, double altura) {
        super(modelo, precio, tipo);
        this.kg = kg;
        this.altura = altura;
    }

    public double getKg() {
        return kg;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Utilitario: " +
                "Maximo de Kg que soporta: " + this.kg + "kg" +
                ", Altura: " + this.altura + "cm" + "\n";
    }
}


