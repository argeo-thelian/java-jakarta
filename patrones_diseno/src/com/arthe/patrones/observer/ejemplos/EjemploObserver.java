package com.arthe.patrones.observer.ejemplos;

import com.arthe.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable,obj) -> {
            System.out.println("John: " + observable );
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Adrés: " + observable );
        });

        google.addObserver((observable,obj) -> {
            System.out.println("Amelia: " +observable );
        });


        google.modificaPrecio(2000);


    }

}
