package com.arthe.anotaciones.ejemplo;

import com.arthe.anotaciones.ejemplo.models.Producto;
import com.arthe.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;


public class EjemploAnotacion {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa de cetro");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));
    }
}
