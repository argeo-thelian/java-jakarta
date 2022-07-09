package com.arthe.mercado.model;

import com.arthe.mercado.entity.Producto;

public class Limpieza extends Producto {

    private String componentes;
    private double litros;

    public Limpieza(String nombre, double precio) {
        super(nombre, precio);
    }

    public Limpieza(String nombre, double precio, String componentes) {
        this(nombre, precio);
        this.componentes = componentes;
    }
    public Limpieza(String nombre, double precio, String componentes, double litros) {
        this(nombre, precio,componentes);
        this.litros = litros;
    }
    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Limpieza con componentes='" + componentes + '\'' +
                "y litros=" + litros;
    }
}
