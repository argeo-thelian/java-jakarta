package org.arthe.poosupermercado.models;

public class Lacteo extends Producto{
    private Integer cantidad;
    private Integer proteinas;

    public Lacteo(String nombre, Double precio, Integer cantidad, Integer proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public Integer getCantidad() { return cantidad;}

    public void setCantidad(Integer cantidad) {this.cantidad = cantidad;}

    public Integer getProteinas() {return proteinas;}

    public void setProteinas(Integer proteinas) {this.proteinas = proteinas;}

    @Override
    public String toString() {
        return  "id = "             + id +
                ", nombre = "       + nombre +
                ", precio = "       + precio +
                ", cantidad = "     + cantidad +
                ", proteinas = "    + proteinas;
    }
}

