package com.arthe.catalogos.model.electronica;

public class TvLcd extends Electronico{

    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return this.pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.5;
    }

    @Override
    public String toString() {
        return this.getFabricante() + "{" +
                " pulgada = " + pulgada +
                " precio venta = " + getPrecioVenta() +  '}';
    }
}
