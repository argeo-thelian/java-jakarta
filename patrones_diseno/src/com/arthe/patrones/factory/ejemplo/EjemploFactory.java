package com.arthe.patrones.factory.ejemplo;

import com.arthe.patrones.factory.PizzaProducto;
import com.arthe.patrones.factory.PizzeriaCaliforniaFactory;
import com.arthe.patrones.factory.PizzeriaNewYorkFactory;
import com.arthe.patrones.factory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory cali = new PizzeriaCaliforniaFactory();

        PizzaProducto pizza1 = cali.ordenarPizza("queso");
        System.out.println("Bruce ordena la pizza " + pizza1.getNombre());

        pizza1 = ny.ordenarPizza("pepperoni");
        System.out.println("Andrés ordena una " + pizza1.getNombre());
    }
}
