package com.arthe.patrones.factory;

import com.arthe.patrones.factory.producto.newyork.PizzaNewYorkItaliana;
import com.arthe.patrones.factory.producto.newyork.PizzaNewYorkPepperoni;
import com.arthe.patrones.factory.producto.newyork.PizzaNewYorkvegetariana;

public class PizzeriaNewYorkFactory extends  PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto producto = null;
        switch (tipo) {
            case "vegetariana":
                producto = new PizzaNewYorkvegetariana();
                break;
            case "pepperoni":
                producto = new PizzaNewYorkPepperoni();
                break;
            case "italiana":
                producto = new PizzaNewYorkItaliana();
                break;
            default:
                producto = new PizzaNewYorkItaliana();
        }
        return producto;
    }
}
