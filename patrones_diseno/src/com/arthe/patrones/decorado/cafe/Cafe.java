package com.arthe.patrones.decorado.cafe;

public class Cafe implements Configurable{
    private float precio;
    private String nombre;

    public Cafe(String nombre,float precio) {
        this.precio = precio;
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    @Override
    public float getPrecioBase() {
        return getPrecio();
    }

    @Override
    public String getIngredientes() {
        return getNombre();
    }
}
