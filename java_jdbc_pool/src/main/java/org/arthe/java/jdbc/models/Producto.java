package org.arthe.java.jdbc.models;

import java.util.Date;

public class Producto {
    private Long id;
    private String nombre;
    private Integer precio;
    private Date fechaRegisto;
    private Categoria categoria;
    public Producto() {
    }

    public Producto(Long id, String nombre, Integer precio, Date fechaRegisto) {
        this();
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaRegisto = fechaRegisto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Date getFechaRegisto() {
        return fechaRegisto;
    }

    public void setFechaRegisto(Date fechaRegisto) {
        this.fechaRegisto = fechaRegisto;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return  id + " | " + nombre + " | $" + precio + " | " + fechaRegisto + " | " + categoria.getNombre();
    }
}
