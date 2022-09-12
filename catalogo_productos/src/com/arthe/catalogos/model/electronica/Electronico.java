package com.arthe.catalogos.model.electronica;

import com.arthe.catalogos.model.producto.Producto;

abstract public class Electronico extends Producto implements IElectronico{
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }
}
