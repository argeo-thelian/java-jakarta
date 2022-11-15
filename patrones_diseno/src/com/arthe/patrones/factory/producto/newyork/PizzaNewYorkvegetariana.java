package com.arthe.patrones.factory.producto.newyork;

import com.arthe.patrones.factory.PizzaProducto;

public class PizzaNewYorkvegetariana extends PizzaProducto {

    public PizzaNewYorkvegetariana() {
        super();
        nombre = "Pizza vegetariana New York";
        masa = "Masa integral vegana";
        salsa = "salsa de tomate";
        ingredientes.add("Queso vengano");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Berenjenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando pror 25 min. a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}
