package com.arthe.mercado.model;

import com.arthe.mercado.entity.Producto;

public class NoPerecible extends Producto {

    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio) {
        super(nombre, precio);
    }
    public NoPerecible(String nombre, double precio, int contenido) {
        this(nombre, precio);
        this.contenido = contenido;
    }
    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        this(nombre, precio, contenido);
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNo perecible con un contenido=" + contenido +
                ", calorias=" + calorias;
    }
}
