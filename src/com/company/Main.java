package com.company;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> listaVehiculos = new ArrayList<>();
        Motocicleta zanella = new Motocicleta("Zanella", 30000, "Moto", 200);
        Utilitario berlingo = new Utilitario("Berlingo", 490000, "Utilitario", 90, 210);

        listaVehiculos.add(zanella);
        listaVehiculos.add(berlingo);

        File file = new File("C:\\Users\\facun\\OneDrive\\Desktop\\Programacion3\\probandoJACKSON\\src\\com\\company\\vehiculos.json");
/*
        if(file.exists()){
            for (Vehiculo vehiculo: listaVehiculos){
                try{
                    ObjectMapper mapper = new ObjectMapper();
                    if (vehiculo instanceof Utilitario){
                        Utilitario utilitario = (Utilitario) vehiculo;
                        mapper.writeValue(file, utilitario);
                    } else if (vehiculo instanceof Motocicleta){
                        Motocicleta moto = (Motocicleta) vehiculo;
                        mapper.writeValue(file, moto);
                    }
                    mapper.writeValue(file, vehiculo);
                } catch (Exception e){
                    System.out.println("Error: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        } */

        /// ACA LO QUE HAGO ES ESCRIBIR TODA LA LISTA EN EL ARCHIVO

        if(file.exists()){
            try {
                ObjectMapper mapper = new ObjectMapper();
                mapper.writeValue(file, listaVehiculos);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        /// ACA TENGO PROBLEMAS PARA LEER EL ARCHIVO.

        if(file.exists()){
            try {
                ObjectMapper mapper = new ObjectMapper();
                Utilitario utilitario = mapper.readValue(file, Utilitario.class);
                System.out.println("VEHICULO JACKSON: \n" + utilitario);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if(file.exists()){
            try {
                ObjectMapper mapper = new ObjectMapper();
                Vehiculo vehiculo = mapper.readValue(file, Vehiculo.class);
                System.out.println("VEHICULO JACKSON: \n" + vehiculo);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        if(file.exists()){
            try {
                ObjectMapper mapper = new ObjectMapper();
                Motocicleta moto = mapper.readValue(file, Motocicleta.class);
                System.out.println("VEHICULO JACKSON: \n" + moto);
            } catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        }



    }
}
