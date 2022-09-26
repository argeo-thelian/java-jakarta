package org.arthe.poosupermercado.models;

import java.util.Objects;

public class Producto {
    protected Integer id;

    protected String nombre;
    protected Double precio;

    private static int ultimoId;

    public Producto(String nombre, Double precio){
        this.id = ++ ultimoId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() { return id; }

    public void setId(Integer id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }

    public void setPrecio(Double precio) { this.precio = precio; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
