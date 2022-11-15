package com.arthe.patrones.factory;

import com.arthe.patrones.factory.producto.california.PizzaCaliforniaPepperoni;
import com.arthe.patrones.factory.producto.california.PizzaCaliforniaQueso;
import com.arthe.patrones.factory.producto.california.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProducto crearPizza(String tipo) {
        PizzaProducto pizza = null;
        switch (tipo){
            case "vegetariana":
                pizza = new PizzaCaliforniaVegetariana();
                break;
            case "queso":
                pizza = new PizzaCaliforniaQueso();
                break;
            case "Pepperoni":
                pizza = new PizzaCaliforniaPepperoni();
                break;
        }
        return pizza;
    }
}
