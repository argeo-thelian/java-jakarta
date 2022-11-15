package com.arthe.patrones.decorado.cafe;

import com.arthe.patrones.decorado.cafe.decorador.ConChocolateDecorador;
import com.arthe.patrones.decorado.cafe.decorador.ConCremaDecorador;
import com.arthe.patrones.decorado.cafe.decorador.ConLecheDecorador;

public class EjemploCafe {
    public static void main(String[] args){
        Configurable cafe = new Cafe("Cafe Moca", 7);

        Configurable conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del " + conChocolate.getIngredientes() + " es de $" + conChocolate.getPrecioBase());

        Configurable capuchino = new Cafe("Cafe Capuchino", 4);
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es $" + conLeche.getPrecioBase());
        System.out.println("Los ingredientes son: " + conLeche.getIngredientes());

        Configurable espresso = new Cafe("Cafe Expresso", 3);
        System.out.println("EL precio del cafe espresso es $" + espresso.getPrecioBase());
        System.out.println("Los ingredientes son: " + espresso.getIngredientes());
    }
}
