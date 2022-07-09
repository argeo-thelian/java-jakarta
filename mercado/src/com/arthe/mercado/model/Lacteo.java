package com.arthe.mercado.model;

import com.arthe.mercado.entity.Producto;

public class Lacteo extends Producto {

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, double precio) {
        super(nombre, precio);
    }

    public Lacteo(String nombre, double precio, int cantidad) {
        this(nombre, precio);
        this.cantidad = cantidad;
    }
    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        this(nombre, precio, cantidad);
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLacteo con cantidad=" + cantidad +
                " y proteinas=" + proteinas;
    }
}
