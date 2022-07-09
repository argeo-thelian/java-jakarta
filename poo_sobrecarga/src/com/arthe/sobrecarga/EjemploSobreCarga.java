package com.arthe.sobrecarga;

import static com.arthe.sobrecarga.Calculadora.*;
public class EjemploSobreCarga {
    public static void main(String[] args) {

        //Restingir la instancia
        //Convirtiendo los metodos de tipo static y el
        //Constructor de tipo private
        //Calculadora cal = new Calculadora();
        System.out.println("Sumar int: " + sumar(3,2));
        System.out.println("Sumar int: " + sumar(3,2,2,4,2,2,2,12));
    }
}
