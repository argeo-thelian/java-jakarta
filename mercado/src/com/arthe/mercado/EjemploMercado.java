package com.arthe.mercado;

import com.arthe.mercado.entity.Producto;
import com.arthe.mercado.model.Fruta;
import com.arthe.mercado.model.Lacteo;
import com.arthe.mercado.model.Limpieza;
import com.arthe.mercado.model.NoPerecible;

public class EjemploMercado {
    public static void main(String[] args) {

        Lacteo leche = new Lacteo("Leche", 15.0, 350, 500);
        Fruta uva = new Fruta("Uva", 21.0,1000);
        uva.setColor("Morado");
        Limpieza cloro = new Limpieza("Cloro", 23,"Liquido",350);
        NoPerecible noPerecible = new NoPerecible("Licuado", 14, 340);
        noPerecible.setCalorias(230);

        print(leche);
        print(uva);
        print(cloro);
        print(noPerecible);
    }

    public static void print(Producto producto){
        System.out.println(producto);
        System.out.println("\n");
    }
}
