package com.arthe.catalogos;

import com.arthe.catalogos.model.electronica.IPhone;
import com.arthe.catalogos.model.electronica.TvLcd;
import com.arthe.catalogos.model.libro.Comics;
import com.arthe.catalogos.model.producto.IProducto;
import com.arthe.catalogos.model.producto.Producto;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {
        IProducto[] productos = new Producto[3];

        productos[0] = new Comics(1000,new Date(), "Thomas",
                "Calculusos","Porrua", "The Manhatan");
        productos[1] = new IPhone(34000,"Apple", "13 pro Max","Verde");
        productos[2] = new TvLcd(15000, "LG", 70);

        for (IProducto pro : productos) {
            System.out.println(pro.toString());
        }
    }
}
