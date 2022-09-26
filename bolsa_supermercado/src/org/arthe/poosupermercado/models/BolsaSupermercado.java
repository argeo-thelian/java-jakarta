package org.arthe.poosupermercado.models;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto> {

    private final List<T>  productos;
    private static final int MAX = 35;

    public BolsaSupermercado(){
        this.productos = new ArrayList<>();
    }


    public List<T> getProductos(){
        return productos;
    }

    public BolsaSupermercado<T> addProducto(T t){
            if(this.productos.size() <= MAX){
                this.productos.add(t);
            } else {
               throw new RuntimeException("No hay más espacio.");
            }
            return this;
    }

    public BolsaSupermercado<T> separaArray(List<? extends Producto> arrayList){
        arrayList.forEach(elem -> this.addProducto((T) elem));
        return this;
    }
}
